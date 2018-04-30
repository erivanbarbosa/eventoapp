package br.com.redesprou.eventoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventoController {

	@RequestMapping("/cadastrarEvento")
	public String fiorm() {
		return "evento/formEvento";
	}
}
