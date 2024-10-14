package com.historial.clinica.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.historial.clinica.entity.Consulta;

@Component
public interface ConsultaDao {
	Consulta create(Consulta c);
	Consulta update(Consulta c);
	void delete(Long id);
	Consulta read(Long id);
	List<Consulta>readAll();
}
