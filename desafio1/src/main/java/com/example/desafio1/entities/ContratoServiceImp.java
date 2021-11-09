package com.example.desafio1.entities;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContratoServiceImp implements ContratoServiceI{
	@Autowired
	private ContratoDaoI contratoDao;

	@Override
	@Transactional
	public void insertarContrato(Contrato c) {
		// TODO Auto-generated method stub
		contratoDao.insertarContrato(c);
	}

	@Override
	@Transactional
	public Contrato searchContratoById(Long idContrato) {
		// TODO Auto-generated method stub
		return contratoDao.searchContratoById(idContrato);
	}

	

	@Override
	@Transactional
	public List<Contrato> searchContratos() {
		// TODO Auto-generated method stub
		return contratoDao.searchContratos();
	}

	@Override
	@Transactional
	public void updateContrato(Contrato c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void deleteContrato(Contrato c) {
		// TODO Auto-generated method stub
		
	}


}
