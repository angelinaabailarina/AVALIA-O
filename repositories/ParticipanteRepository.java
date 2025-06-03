package com.example.ninoca.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.ninoca.entities.Participante;



public interface ParticipanteRepository extends JpaRepository<Participante, Long>{
	
	@Query(value = "SELECT * FROM tb_participante WHERE LOWER(nome) LIKE LOWER(CONCAT('%', :nome, '%'))", nativeQuery=true)
	Participante buscarPorTitulo(@Param("nome") String nome);
}