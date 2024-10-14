package com.historial.clinica.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.historial.clinica.entity.Consulta;

@Service
public interface ConsultaService {
	Consulta create(Consulta c);
	Consulta update(Consulta c);
	void delete(Long id);
	Consulta read(Long id);
	List<Consulta>readAll();
}
