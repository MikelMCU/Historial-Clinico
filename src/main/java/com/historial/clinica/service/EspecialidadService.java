package com.historial.clinica.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.historial.clinica.entity.Especialidad;

@Service
public interface EspecialidadService {
	Especialidad create(Especialidad e);
	Especialidad update(Especialidad e);
	void delete(Long id);
	Especialidad read(Long id);
	List<Especialidad>readAll();
}
