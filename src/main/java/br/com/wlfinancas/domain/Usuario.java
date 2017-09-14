package br.com.wlfinancas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Usuario extends GenericDomain {

	@Column(length = 45, nullable = false)
	private String usu_nome;

	@Column(length = 50, nullable = false)
	private String usu_login;

	@Column(length = 15, nullable = false)
	private String usu_senha;

	@Column(length = 14, nullable = false)
	private String usu_telefone;

	@Column(length = 14, nullable = false)
	private String usu_cpf;

	@Column(nullable = false)
	private Boolean usu_status;

	@Column(nullable = false)
	private Integer usu_delete;

	public String getUsu_nome() {
		return usu_nome;
	}

	public void setUsu_nome(String usu_nome) {
		this.usu_nome = usu_nome;
	}

	public String getUsu_login() {
		return usu_login;
	}

	public void setUsu_login(String usu_login) {
		this.usu_login = usu_login;
	}

	public String getUsu_senha() {
		return usu_senha;
	}

	public void setUsu_senha(String usu_senha) {
		this.usu_senha = usu_senha;
	}

	public String getUsu_telefone() {
		return usu_telefone;
	}

	public void setUsu_telefone(String usu_telefone) {
		this.usu_telefone = usu_telefone;
	}

	public String getUsu_cpf() {
		return usu_cpf;
	}

	public void setUsu_cpf(String usu_cpf) {
		this.usu_cpf = usu_cpf;
	}

	public Boolean getUsu_status() {
		return usu_status;
	}

	public void setUsu_status(Boolean usu_status) {
		this.usu_status = usu_status;
	}

	public Integer getUsu_delete() {
		return usu_delete;
	}

	public void setUsu_delete(Integer usu_delete) {
		this.usu_delete = usu_delete;
	}

}
