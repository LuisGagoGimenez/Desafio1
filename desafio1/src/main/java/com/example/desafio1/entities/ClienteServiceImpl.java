package com.example.desafio1.entities;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClienteServiceImpl implements ClienteServiceI{
	
	@Autowired
	private ClienteDaoI clienteDao;
	
	@Override
	@Transactional
	public void insertarCliente(Cliente c) {
		// TODO Auto-generated method stub
		clienteDao.insertarCliente(c);

	}

	@Override
	@Transactional
	public Cliente searchClienteById(Long idCliente) {
		// TODO Auto-generated method stub
		return clienteDao.searchClienteById(idCliente);
	}

	@Override
	@Transactional
	public List<Cliente> searchClientes() {
		// TODO Auto-generated method stub
		
		return clienteDao.searchClientes();
	}

	@Override
	@Transactional
	public void updateCliente(Cliente c) {
		// TODO Auto-generated method stub
		clienteDao.updateCliente(c);
	}

	@Override
	@Transactional
	public void deleteCliente(Cliente c) {
		// TODO Auto-generated method stub
		clienteDao.deleteCliente(c);
	}

	@Override
	@Transactional
	public Cliente searchClienteByNombreApellidos(String nombre, String apellido1, String apellido2) {
		// TODO Auto-generated method stub
		
		return clienteDao.searchClienteByNombreApellidos(nombre, apellido1, apellido2);
	}
	
}
