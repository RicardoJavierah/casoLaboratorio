package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "Especialidad")
public class Especialidad {

	@Id
	private Integer idEspecialidad;
	@Column(name = "NomEsp")
	private String NomEsp;
	@Column(name = "costo")
	private Integer costo;
}
