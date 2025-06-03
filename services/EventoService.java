package com.example.ninoca.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.example.ninoca.entities.Evento;
import com.example.ninoca.repositories.EventoRepository;



@Service
public class EventoService {
	
	private final EventoRepository eventoRepository;
	
	public EventoService(EventoRepository eventoRepository) {
		this.eventoRepository = eventoRepository;
	}
	
	public Evento findEventoById(Long id) {
		Optional<Evento> evento = eventoRepository.findById(id);
		return evento.orElse(null);
	}
	public Evento insertEvento(Evento evento) {
		return eventoRepository.save(evento);
	}
	public void deleteEvento(Long id) {
		eventoRepository.deleteById(id);
	}
	public List<Evento> findAllEventos(){
		return eventoRepository.findAll();
	}
}
