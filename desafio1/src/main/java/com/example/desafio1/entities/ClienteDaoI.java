package com.example.desafio1.entities;

import java.util.List;

public interface ClienteDaoI {
	public void insertarCliente(Cliente c);
	public Cliente searchClienteById(Long idCliente);
	public Cliente searchClienteByNombreApellidos(String nombre, String apellido1, String apellido2);
	public List<Cliente> searchClientes();
	public void updateCliente(Cliente c);
	public void deleteCliente(Cliente c);
	
	
}
