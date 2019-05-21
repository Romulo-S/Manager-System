package model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
public class Token {

	@Id
	@GeneratedValue
	private Long id;
	private String token;
	private String login;
	private Date expiracao;
	private boolean administrador;
	
	public Token(String token, String login, boolean administrador) {
		super();
		this.token = token;
		this.login = login;
		this.administrador = administrador;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Date getExpiracao() {
		return expiracao;
	}

	public void setExpiracao(Date expiracao) {
		this.expiracao = expiracao;
	}

	public boolean isAdministrador() {
		return administrador;
	}

	public void setAdministrador(boolean administrador) {
		this.administrador = administrador;
	}

	public Long getId() {
		return id;
	}
}
