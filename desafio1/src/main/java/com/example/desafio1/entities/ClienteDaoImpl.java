package com.example.desafio1.entities;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class ClienteDaoImpl implements ClienteDaoI {

	@Autowired
	private EntityManager entityManager;

	@Override
	public void insertarCliente(Cliente c) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);

		session.save(c);

		session.close();

	}

	@Override
	public Cliente searchClienteById(Long idCliente) {
		// TODO Auto-generated method stub
		Session s = entityManager.unwrap(Session.class);

		Cliente cliente = (Cliente) s.createQuery("FROM Cliente WHERE id =" + idCliente).uniqueResult();

		s.close();
		return cliente;
	}

	@Override
	public List<Cliente> searchClientes() {
		// TODO Auto-generated method stub
		Session s = entityManager.unwrap(Session.class);

		List<Cliente> clientes =  s.createQuery("FROM CLIENTE").getResultList();

		s.close();
		return clientes;
	}

	@Override
	public void updateCliente(Cliente c) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);

		session.saveOrUpdate(c);

		session.close();
	}

	@Override
	public void deleteCliente(Cliente c) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);

		entityManager.remove(entityManager.merge(c));

		session.close();
	}

	@Override
	public Cliente searchClienteByNombreApellidos(String nombre, String apellido1, String apellido2) {
		// TODO Auto-generated method stub
		Session s = entityManager.unwrap(Session.class);

		Cliente cliente = (Cliente) s.createQuery("FROM CLIENTE WHERE nombre=" + nombre + " AND apellido1 = " + apellido1 + " AND apellido2 = " + apellido2).uniqueResult();

		s.close();
		return cliente;
	}

}
