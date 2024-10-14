package com.historial.clinica.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "medicos")
public class Medico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombres", columnDefinition = "varchar(45)")
	private String nombres;
	@Column(name = "apellidos", columnDefinition = "varchar(45)")
	private String apellidos;
	
	@ManyToOne
	@JoinColumn(name = "especialidad_id")
	private Especialidad especialidad;
	
	@OneToMany(mappedBy = "medico",cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Consulta>consultas;
}