package com.seguimiento.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.seguimiento.model.Usuario;
import com.seguimiento.repository.usuario.UsuarioRepository;
import com.seguimiento.repository.usuario.usuarioService;

@RestController
public class UsuarioController implements usuarioService {

	@Autowired
	private UsuarioRepository usuarioRepo;
	
	@GetMapping("/usuarios")
	public List<Usuario> findAll() {
		List<Usuario> usuarioList = usuarioRepo.findAll();
		return usuarioList;
	}

	@GetMapping("/usuarios/{usuarioId}")
	public Optional < Usuario > findById(@PathVariable Long usuarioId) {
		return usuarioRepo.findById(usuarioId);
	}

	@PostMapping("/usuarios/newusuario")
	public void save(Usuario usuario) {
		usuarioRepo.save(usuario);
	}
	
	@PostMapping("/usuarios/delete/{usuarioId}")
	public void delete(@PathVariable Long usuarioId){
		usuarioRepo.deleteById(usuarioId);
	}
}
