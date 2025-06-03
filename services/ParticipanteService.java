package com.example.ninoca.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.ninoca.entities.Participante;
import com.example.ninoca.repositories.ParticipanteRepository;


@Service
public class ParticipanteService {
private final ParticipanteRepository participanteRepository;
	
	public ParticipanteService(ParticipanteRepository participanteRepository) {
		this.participanteRepository = participanteRepository;
	}
	public Participante findParticipanteById(Long id) {
		Optional<Participante> participante = participanteRepository.findById(id);
		return participante.orElse(null);
	}
	public List<Participante> findAllParticipantes(){
		return participanteRepository.findAll();
	}
	public Participante insertParticipante(Participante participante) {
		return participanteRepository.save(participante);
	}
	 public Participante buscarPorNome(String nome){
	    	return participanteRepository.buscarPorTitulo(nome);  
	    	}
	 public void deleteParticipante(Long id) {
			participanteRepository.deleteById(id);
		}
}
