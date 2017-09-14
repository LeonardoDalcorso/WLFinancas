package br.com.wlfinancas.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Conta extends GenericDomain {

	@Column(length = 45, nullable = false)
	private String con_tipo;

	@Column(length = 45, nullable = false)
	private String con_descricao;

	@Column(nullable = false)
	private Double con_valor;

	@Column(nullable = false)
	private Date con_dat_venci;

	@Column(nullable = false)
	private Date con_dat_prevista;

	@Column(nullable = false)
	private Boolean con_delete;

	@Column(nullable = false)
	private Boolean con_status;

	@Column(nullable = false)
	private Date con_dat_insercao;

	@Column(nullable = false)
	private Date con_dat_pg;

	public Credor getCon_cod_credor() {
		return con_cod_credor;
	}

	public void setCon_cod_credor(Credor con_cod_credor) {
		this.con_cod_credor = con_cod_credor;
	}

	@Column
	private Integer con_cod_usu_ins;
	
	@Column
	private Integer con_cod_usu_pg;
	
	@ManyToOne
	private Credor con_cod_credor;
	

	public Integer getCon_cod_usu_ins() {
		return con_cod_usu_ins;
	}

	public void setCon_cod_usu_ins(Integer con_cod_usu_ins) {
		this.con_cod_usu_ins = con_cod_usu_ins;
	}

	public Integer getCon_cod_usu_pg() {
		return con_cod_usu_pg;
	}

	public void setCon_cod_usu_pg(Integer con_cod_usu_pg) {
		this.con_cod_usu_pg = con_cod_usu_pg;
	}

	public String getCon_tipo() {
		return con_tipo;
	}

	public void setCon_tipo(String con_tipo) {
		this.con_tipo = con_tipo;
	}

	public String getCon_descricao() {
		return con_descricao;
	}

	public void setCon_descricao(String con_descricao) {
		this.con_descricao = con_descricao;
	}

	public Double getCon_valor() {
		return con_valor;
	}

	public void setCon_valor(Double con_valor) {
		this.con_valor = con_valor;
	}

	public Date getCon_dat_venci() {
		return con_dat_venci;
	}

	public void setCon_dat_venci(Date con_dat_venci) {
		this.con_dat_venci = con_dat_venci;
	}

	public Date getCon_dat_prevista() {
		return con_dat_prevista;
	}

	public void setCon_dat_prevista(Date con_dat_prevista) {
		this.con_dat_prevista = con_dat_prevista;
	}

	public Boolean getCon_delete() {
		return con_delete;
	}

	public void setCon_delete(Boolean con_delete) {
		this.con_delete = con_delete;
	}

	public Boolean getCon_status() {
		return con_status;
	}

	public void setCon_status(Boolean con_status) {
		this.con_status = con_status;
	}

	public Date getCon_dat_insercao() {
		return con_dat_insercao;
	}

	public void setCon_dat_insercao(Date con_dat_insercao) {
		this.con_dat_insercao = con_dat_insercao;
	}

	public Date getCon_dat_pg() {
		return con_dat_pg;
	}

	public void setCon_dat_pg(Date con_dat_pg) {
		this.con_dat_pg = con_dat_pg;
	}

	

	

}
