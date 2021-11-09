package com.example.desafio1.entities;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ContratoDaoImpl implements ContratoDaoI {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public void insertarContrato(Contrato c) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);

		session.save(c);

		session.close();
	}

	@Override
	public Contrato searchContratoById(Long idContrato) {
		// TODO Auto-generated method stub
		Session s = entityManager.unwrap(Session.class);

		Contrato contrato = (Contrato) s.createQuery("FROM Contrato WHERE id =" + idContrato).uniqueResult();

		s.close();
		return contrato;
	}


	@Override
	public List<Contrato> searchContratos() {
		// TODO Auto-generated method stub
		Session s = entityManager.unwrap(Session.class);

		List<Contrato> contratos =  s.createQuery("FROM Contrato").getResultList();

		s.close();
		return contratos;
	}

	@Override
	public void updateContrato(Contrato c) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);

		session.saveOrUpdate(c);

		session.close();
	}

	@Override
	public void deleteContrato(Contrato c) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);

		entityManager.remove(entityManager.merge(c));

		session.close();
	}

}
