package com.pfc.bet.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {
	
//	@Autowired
//	private UsuarioService usuarioService;
	
	@GetMapping
	public ResponseEntity<String> getUser() {
		
//		UsuarioDto usuario = usuarioService.getUsuario();
		
		return ResponseEntity.ok("ricardo de aguiar vieira");
	}
}
