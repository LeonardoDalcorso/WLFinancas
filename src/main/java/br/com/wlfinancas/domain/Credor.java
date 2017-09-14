package br.com.wlfinancas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Credor extends GenericDomain{

	@Column(length = 50, nullable = false)
	private String cre_descricao;
	
	@Column(length = 14)
	private String cre_telefone;
	
	@Column(length = 50)
	private String cre_rua;
	
	@Column
	private Integer cre_numero;
	
	@Column(length = 50)
	private String cre_bairro;
	
	@Column(length = 11)
	private String cre_cep;
	
	@Column(length = 50)
	private String cre_cidade;

	public String getCre_descricao() {
		return cre_descricao;
	}

	public void setCre_descricao(String cre_descricao) {
		this.cre_descricao = cre_descricao;
	}

	public String getCre_telefone() {
		return cre_telefone;
	}

	public void setCre_telefone(String cre_telefone) {
		this.cre_telefone = cre_telefone;
	}

	public String getCre_rua() {
		return cre_rua;
	}

	public void setCre_rua(String cre_rua) {
		this.cre_rua = cre_rua;
	}

	public Integer getCre_numero() {
		return cre_numero;
	}

	public void setCre_numero(Integer cre_numero) {
		this.cre_numero = cre_numero;
	}

	public String getCre_bairro() {
		return cre_bairro;
	}

	public void setCre_bairro(String cre_bairro) {
		this.cre_bairro = cre_bairro;
	}

	public String getCre_cep() {
		return cre_cep;
	}

	public void setCre_cep(String cre_cep) {
		this.cre_cep = cre_cep;
	}

	public String getCre_cidade() {
		return cre_cidade;
	}

	public void setCre_cidade(String cre_cidade) {
		this.cre_cidade = cre_cidade;
	}
	
}
