package com.dev.pesquisa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.pesquisa.dto.GameDTO;
import com.dev.pesquisa.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameResource {

	@Autowired
	private GameService service;

	@GetMapping
	public ResponseEntity<List<GameDTO>> findAll() { // ResponseEntity: reposta de requisição com algum conteudo
		List<GameDTO> list = service.findAll();
		return ResponseEntity.ok().body(list); // ok: construir um objeto com a resposta que deu certo a requisição
												// body: corpo da mensagem

	}

}
