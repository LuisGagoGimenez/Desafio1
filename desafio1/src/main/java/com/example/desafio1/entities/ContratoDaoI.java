package com.example.desafio1.entities;

import java.util.List;

public interface ContratoDaoI {
	public void insertarContrato(Contrato c);
	public Contrato searchContratoById(Long idContrato);
	public List<Contrato> searchContratos();
	public void updateContrato(Contrato c);
	public void deleteContrato(Contrato c);
}
