package com.example.ninoca.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.ninoca.entities.Evento;
import com.example.ninoca.services.EventoService;


@RestController
@RequestMapping("/eventos")
public class EventoController {
	
	private final EventoService eventoService;
	
	private EventoController(EventoService eventoService) {
		this.eventoService = eventoService;
	}
	@PostMapping("/salvar")
	public Evento createEvento(@RequestBody Evento evento) {
		return eventoService.insertEvento(evento);
	}
	
	@GetMapping("/{id}")
	public Evento getEvento(@PathVariable Long id) {
		return eventoService.findEventoById(id);
	}
	@DeleteMapping("/{id}")
	public void deleteEvento(@PathVariable Long id) {
		eventoService.deleteEvento(id);
	}
	@GetMapping("/")
	public List<Evento> getAllEventos(){
		return eventoService.findAllEventos();
	}
	

}
