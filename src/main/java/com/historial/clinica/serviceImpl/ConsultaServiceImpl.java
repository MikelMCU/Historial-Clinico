package com.historial.clinica.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.historial.clinica.dao.ConsultaDao;
import com.historial.clinica.entity.Consulta;
import com.historial.clinica.service.ConsultaService;
@Service
public class ConsultaServiceImpl implements ConsultaService {

	@Autowired
	private ConsultaDao consultaDao;
	@Override
	public Consulta create(Consulta c) {
		// TODO Auto-generated method stub
		return consultaDao.create(c);
	}

	@Override
	public Consulta update(Consulta c) {
		// TODO Auto-generated method stub
		return consultaDao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		consultaDao.delete(id);
	}

	@Override
	public Consulta read(Long id) {
		// TODO Auto-generated method stub
		return consultaDao.read(id);
	}

	@Override
	public List<Consulta> readAll() {
		// TODO Auto-generated method stub
		return consultaDao.readAll();
	}

}
