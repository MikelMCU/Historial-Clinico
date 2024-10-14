package com.historial.clinica.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.historial.clinica.entity.Medico;

@Service
public interface MedicoService {
	Medico create(Medico m);
	Medico update(Medico m);
	void delete(Long id);
	Medico read(Long id);
	List<Medico>searchMedico(String filtro);
	List<Medico>readAll();
}
