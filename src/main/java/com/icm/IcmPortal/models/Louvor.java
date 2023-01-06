package com.icm.IcmPortal.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Louvor")
public class Louvor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	

	@Column(name = "nome")
	private String nome;
	
	@Column(name = "numero")
	private int numero;
	
	@Column(name = "tom")
	private String tom;
	
	@Column(name = "nomeigreja")
	private String nomeIgreja;


	public String getNomeIgreja() {
		return nomeIgreja;
	}

	public void setNomeIgreja(String nomeIgreja) {
		this.nomeIgreja = nomeIgreja;
	}

	public void setNumero(int numero) {
		this.numero = numero;
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

	public int getNumero() {
		return numero;
	}

	public String getTom() {
		return tom;
	}

	public void setTom(String tom) {
		this.tom = tom;
	}
	
}
