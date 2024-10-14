package com.historial.clinica.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.historial.clinica.entity.Diagnostico;

@Service
public interface DiagnosticoService {
	Diagnostico create(Diagnostico d);
	Diagnostico update(Diagnostico d);
	void delete(Long id);
	Diagnostico read(Long id);
	List<Diagnostico>readAll();
}
