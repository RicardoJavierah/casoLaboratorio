package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Especialidad;
import com.example.demo.repository.EspecialidadRepository;

public class EspecialidadService {	
	@Autowired
	private EspecialidadRepository especialidadRepository;
	
	public List<Especialidad> listarEspecialidad(){
		return especialidadRepository.findAll();
	}
	
	public void registrarEspecialidad(Especialidad especialidad) {
		especialidadRepository.save(especialidad);
	}
}
