package com.example.desafio1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.desafio1.entities.Cliente;
import com.example.desafio1.entities.ClienteServiceI;
import com.example.desafio1.entities.Contrato;
import com.example.desafio1.entities.ContratoServiceI;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {
	@Autowired
	private ClienteServiceI clienteService;

	@Autowired
	private ContratoServiceI contratoService;
	
	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Contrato> listaContratos = new ArrayList<>();
		
		String entrada1 = "2027-07-25"; 
		String entrada2 = "2018-03-14"; 
		String entrada3 = "2017-11-11"; 
		String entrada4 = "2019-12-19"; 
		DateFormat format = new SimpleDateFormat("YYYY-MM-DD"); 
		Date fecha = format.parse(entrada1);
		Date fecha2 = format.parse(entrada2);
		Date fecha3 = format.parse(entrada3);
		Date fecha4 = format.parse(entrada4);
		
		//--------------------------------------------------------------------------------------------------------------------
		Contrato cc = new Contrato();
		cc.setPrecio(150.5);

		cc.setFechaCaducidad(fecha);
		cc.setFechaVigencia(fecha2);
		
		
		Contrato cc2 = new Contrato();
		cc2.setPrecio(170.5);

		cc2.setFechaCaducidad(fecha3);
		cc2.setFechaVigencia(fecha4);
		
		
		
		
		Cliente c = new Cliente();

		c.setNombre("Pedro");
		c.setApellido1("Ramirez");
		c.setApellido2("Montoya");
		c.setDni("55500000I");
		
		
	    
	    cc.setCliente(c);
//		Cliente c2 = new Cliente();
//
//		c2.setNombre("Luis");
//		c2.setApellido1("Gago");
//		c2.setApellido2("Gimenez");
//		c2.setDni("00000000I");
		
		
		cc2.setCliente(c);
		listaContratos.add(cc);
		
		listaContratos.add(cc2);
		c.setListaContratos(listaContratos);
		//c2.setListaContratos(listaContratos);
		
		clienteService.insertarCliente(c);
		//clienteService.insertarCliente(c2);
		
		
		
		//--------------------------------------------------------------------------------------------------------------------
		
		
		Cliente client = clienteService.searchClienteById((long) 1);

		System.out.println("- - - - - -         - - - - - -                - - - - - -");
		System.out.println(client.getNombre());
		System.out.println(client.getApellido1());
		System.out.println(client.getApellido2());
		
		
		
		
	}
}
