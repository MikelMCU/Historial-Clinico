package com.historial.clinica.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.historial.clinica.entity.Paciente;

@Service
public interface PacienteService {
	Paciente create(Paciente p);
	Paciente update(Paciente p);
	void delete(Long id);
	Paciente read(Long id);
	List<Paciente>readAll();
}
