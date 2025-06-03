package com.example.ninoca.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.ninoca.entities.Evento;


public interface EventoRepository extends JpaRepository<Evento, Long>{
	
	//@Query("SELECT a from Evento a Join a.participantes c WHERE c.nomeParticipante = :nomeParticipante")
	//List<Evento> findEventoByParticipante(@Param("nomeParticipante") String nomeParticipante);
}
