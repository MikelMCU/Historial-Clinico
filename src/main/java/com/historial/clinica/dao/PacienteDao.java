package com.historial.clinica.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.historial.clinica.entity.Paciente;

@Component
public interface PacienteDao {
	Paciente create(Paciente p);
	Paciente update(Paciente p);
	void delete(Long id);
	Paciente read(Long id);
	List<Paciente>readAll();
}
