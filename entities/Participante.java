package com.example.ninoca.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name= "tb_participante")
public class Participante {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String email;
	
	@ManyToMany(mappedBy = "participantes", fetch = FetchType.LAZY)
	private List<Evento> eventos;
	
	public Participante() {
		
	}

	public Participante(Long id, String nome, String email, List<Evento> eventos) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.eventos = eventos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}
	
	
}
