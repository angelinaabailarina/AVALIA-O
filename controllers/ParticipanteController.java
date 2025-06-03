package com.example.ninoca.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ninoca.entities.Participante;
import com.example.ninoca.services.ParticipanteService;


@RestController
@RequestMapping("/participantes")
public class ParticipanteController {
		private final ParticipanteService participanteService;
			
			private ParticipanteController(ParticipanteService participanteService) {
				this.participanteService = participanteService;
			}
			@PostMapping("/salvar")
			public Participante createParticipante(@RequestBody Participante participante) {
				return participanteService.insertParticipante(participante);
			}
			
			@GetMapping("/{id}")
			public Participante getParticipanteById(@PathVariable Long id) {
				return participanteService.findParticipanteById(id);
				
			}
			@GetMapping("/listar")
			public List<Participante> getAllParticipantes(){
				return participanteService.findAllParticipantes();
			}
			  @GetMapping("/buscar/{nome}")
			    public Participante ListarParticipantesPorNome(@PathVariable String nome){
			    	return participanteService.buscarPorNome(nome);
			}
			@DeleteMapping("/{id}")
		    public void deleteParticipante(@PathVariable Long id) {
				participanteService.deleteParticipante(id);
			}
}
