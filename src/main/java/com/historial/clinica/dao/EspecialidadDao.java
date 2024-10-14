package com.historial.clinica.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.historial.clinica.entity.Especialidad;

@Component
public interface EspecialidadDao {
	Especialidad create(Especialidad e);
	Especialidad update(Especialidad e);
	void delete(Long id);
	Especialidad read(Long id);
	List<Especialidad>readAll();
}
