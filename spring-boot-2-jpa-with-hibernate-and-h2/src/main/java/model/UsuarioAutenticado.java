package model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class UsuarioAutenticado {

	@Id
	@GeneratedValue
	private String login;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login2) {
		this.login = login2;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Token getToken() {
		return token;
	}
	public void setToken(Token token2) {
		this.token = token2;
	}
	public boolean isAdministrador() {
		return administrador;
	}
	public void setAdministrador(boolean administrador) {
		this.administrador = administrador;
	}
	public boolean isAutenticado() {
		return autenticado;
	}
	public void setAutenticado(boolean autenticado) {
		this.autenticado = autenticado;
	}
	private String nome;
	private Token token;	
	private boolean administrador;
	private boolean autenticado;	
}
