package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

public class EspecialidadService {	
	@Autowired
	private EspecialidadRepository estadoRepository;
	
	public List<Estado> listarEstados(){
		return estadoRepository.findAll();
	}
	
	public void registrarEstado(Estado estado) {
		estadoRepository.save(estado);
	}
}
