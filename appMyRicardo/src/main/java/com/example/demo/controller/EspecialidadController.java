package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Especialidad;
import com.example.demo.service.EspecialidadService;

@Controller
@RequestMapping("/Especialidad")
public class EspecialidadController {
		@Autowired
		private EspecialidadService especialidadService;
		
		@GetMapping("/listaEspecialidad")
		public String frmMantEstado(Model model) {
			model.addAttribute("listaEspecialidad",
					especialidadService.listarEspecialidad());
			return "Especialidad/listaEspecialidad";
		}
		
		@GetMapping("/frmRegEspecialidad")
		public String frmRegEstado(Model model) {
			model.addAttribute("estadoForm", 
					new Especialidad();
			model.addAttribute("visualizar", false);
			return "Estado/frmRegEstado";

}
