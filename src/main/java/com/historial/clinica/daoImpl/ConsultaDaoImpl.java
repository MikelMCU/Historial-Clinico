package com.historial.clinica.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.historial.clinica.dao.ConsultaDao;
import com.historial.clinica.entity.Consulta;
import com.historial.clinica.repository.ConsultaRepository;
@Component
public class ConsultaDaoImpl implements ConsultaDao {

	@Autowired
	private ConsultaRepository consultaRepository;
	@Override
	public Consulta create(Consulta c) {
		// TODO Auto-generated method stub
		return consultaRepository.save(c);
	}

	@Override
	public Consulta update(Consulta c) {
		// TODO Auto-generated method stub
		return consultaRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		consultaRepository.deleteById(id);
		
	}

	@Override
	public Consulta read(Long id) {
		// TODO Auto-generated method stub
		return consultaRepository.findById(id).get();
	}

	@Override
	public List<Consulta> readAll() {
		// TODO Auto-generated method stub
		return consultaRepository.findAll();
	}

}
