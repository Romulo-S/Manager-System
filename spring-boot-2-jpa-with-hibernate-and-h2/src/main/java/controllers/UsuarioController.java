package controllers;

import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.Token;
import model.Usuario;
import model.UsuarioAutenticado;
import repository.TokenRepository;
import repository.UsuarioRepository;
import service.TokenService;

@RestController
public class UsuarioController {

	@Autowired
    private UsuarioRepository usuarioRepository;
	
	@Autowired
    private TokenRepository tokenRepository;
	
	@Autowired
	private TokenService tokenService;
	
	@RequestMapping(value = "/api/usuario/autenticar/", method = RequestMethod.POST)    
    public ResponseEntity<UsuarioAutenticado> autenticar(@PathVariable("login") String login,@PathVariable("senha") String senha) {
        Usuario usuario = usuarioRepository.findUsuarioByloginEqualsAndsenha(login, senha);
        if (usuario == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        String generatedToken = tokenService.generateToken();
        
        Token token = new Token(generatedToken, login, usuario.isAdministrador());
        
        Timestamp expiracao = new Timestamp(System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(5)) ;
        token.setExpiracao(expiracao);
        
        tokenRepository.save(token);
        
        UsuarioAutenticado autenticado = new UsuarioAutenticado();
        
        
        autenticado.setAdministrador(usuario.isAdministrador());
        autenticado.setAutenticado(true);
        autenticado.setLogin(login);
        autenticado.setNome(usuario.getNome());
        autenticado.setToken(token);
        
        
        return new ResponseEntity<UsuarioAutenticado>(autenticado, HttpStatus.OK);
    }

	

}
