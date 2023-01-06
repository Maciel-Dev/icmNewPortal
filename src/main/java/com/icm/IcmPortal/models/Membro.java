package com.icm.IcmPortal.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Membro")
public class Membro {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "grupo")
	private String grupo;
	
	@Column(name = "batizado")
	private String batizado;
	
	@Column(name = "funcao")
	private String funcao;
	
	@Column(name = "idade")
	private int idade;
	
	@Column(name = "nomePastor")
	private String nomePastor;
	
	public String getNomePastor() {
		return nomePastor;
	}

	public void setNomePastor(String nomePastor) {
		this.nomePastor = nomePastor;
	}

	public String getBatizado() {
		return batizado;
	}

	public void setBatizado(String batizado) {
		this.batizado = batizado;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	
}
