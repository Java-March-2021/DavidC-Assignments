package com.david.theCode.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class BushidoController {
	@RequestMapping("/bushido")
	public String bushido() {
		return "bushido.jsp";
	}
}
