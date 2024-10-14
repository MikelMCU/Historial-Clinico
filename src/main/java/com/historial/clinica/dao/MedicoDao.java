package com.historial.clinica.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.historial.clinica.entity.Medico;

@Component
public interface MedicoDao {
	Medico create(Medico m);
	Medico update(Medico m);
	void delete(Long id);
	Medico read(Long id);
	List<Medico>searchMedico(String filtro);
	List<Medico>readAll();
}
