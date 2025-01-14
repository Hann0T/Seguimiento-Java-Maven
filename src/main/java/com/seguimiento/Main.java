package com.seguimiento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seguimiento.model.*;
import com.seguimiento.repository.*;
import com.seguimiento.repository.categoria.CategoriaRepository;
import com.seguimiento.repository.usuario.UsuarioRepository;
import com.seguimiento.repository.proveedor.ProveedorRepository;

@SpringBootApplication
public class Main implements CommandLineRunner {

	@Autowired
	public UsuarioRepository usuarioRepo;
	@Autowired
	public ProveedorRepository proveedorRepo;
	@Autowired
	public CategoriaRepository categoriaRepo;

	public static void main(String args[]) {
		SpringApplication.run(Main.class, args);
	}

	public void run(String... arg0) throws Exception {
		UsuarioSeeder();
		ProveedorSeeder();
		CategoriaSeeder();
	}
	
	public void UsuarioSeeder() {
		Usuario user1 = new Usuario(11111111, null, "Mickey Mouse", null, 111111111, null, 1111, null);
		Usuario user2 = new Usuario(22222222, null, "Mickey Mouse", null, 222222222, null, 2222, null);
		usuarioRepo.save(user1);
		usuarioRepo.save(user2);
	}

	public void ProveedorSeeder() {
		Proveedor proveedor1 = new Proveedor("Mickey Mouse1", "Mickey Mouse1", "Mickey Mouse1", 45.22, "Mickey Mouse1",
				"Mickey Mouse1");
		Proveedor proveedor2 = new Proveedor("Mickey Mouse2", "Mickey Mouse2", "Mickey Mouse2", 45.23, "Mickey Mouse2",
				"Mickey Mouse2");
		Proveedor proveedor3 = new Proveedor("Mickey Mouse3", "Mickey Mouse3", "Mickey Mouse3", 45.24, "Mickey Mouse4",
				"Mickey Mouse3");
		proveedorRepo.save(proveedor1);
		proveedorRepo.save(proveedor2);
		proveedorRepo.save(proveedor3);
	}

	public void CategoriaSeeder() {
		Categoria categoria1 = new Categoria("Peliculas");
		Categoria categoria2 = new Categoria("Musica");
		Categoria categoria3 = new Categoria("Series");
		Categoria categoria4 = new Categoria("Noticias");
		this.categoriaRepo.save(categoria1);
		this.categoriaRepo.save(categoria2);
		this.categoriaRepo.save(categoria3);
		this.categoriaRepo.save(categoria4);
	}

}