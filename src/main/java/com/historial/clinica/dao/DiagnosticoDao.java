package com.historial.clinica.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.historial.clinica.entity.Diagnostico;

@Component
public interface DiagnosticoDao {
	Diagnostico create(Diagnostico d);
	Diagnostico update(Diagnostico d);
	void delete(Long id);
	Diagnostico read(Long id);
	List<Diagnostico>readAll();
}
