package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Token;
import model.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Token, Long>{

	Usuario findUsuarioByloginEqualsAndsenha(String login, String senha);

}
