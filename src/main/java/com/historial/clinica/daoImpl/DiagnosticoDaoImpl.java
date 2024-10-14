package com.historial.clinica.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.historial.clinica.dao.DiagnosticoDao;
import com.historial.clinica.entity.Diagnostico;
import com.historial.clinica.repository.DiagnosticoRepository;
@Component
public class DiagnosticoDaoImpl implements DiagnosticoDao {

	@Autowired
	private DiagnosticoRepository diagnosticoRepository;
	@Override
	public Diagnostico create(Diagnostico d) {
		// TODO Auto-generated method stub
		return diagnosticoRepository.save(d);
	}

	@Override
	public Diagnostico update(Diagnostico d) {
		// TODO Auto-generated method stub
		return diagnosticoRepository.save(d);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		diagnosticoRepository.deleteById(id);
	}

	@Override
	public Diagnostico read(Long id) {
		// TODO Auto-generated method stub
		return diagnosticoRepository.findById(id).get();
	}

	@Override
	public List<Diagnostico> readAll() {
		// TODO Auto-generated method stub
		return diagnosticoRepository.findAll();
	}

}
