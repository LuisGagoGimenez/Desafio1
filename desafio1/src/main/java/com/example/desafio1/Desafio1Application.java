package com.example.desafio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.desafio1.entities.Cliente;
import com.example.desafio1.entities.ClienteServiceI;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {

	@Autowired
	private ClienteServiceI clienteService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Cliente c = new Cliente();

		c.setNombre("Luis");
		c.setApellido1("Gago");
		c.setApellido2("Gimenez");
		c.setDni("00000000I");
		clienteService.insertarCliente(c);

		Cliente client = clienteService.searchClienteById((long) 1);

		System.out.println("- - - - - -         - - - - - -                - - - - - -");
		System.out.println(client.getNombre());
	}
}
