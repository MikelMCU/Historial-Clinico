package com.historial.clinica.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.historial.clinica.dao.DiagnosticoDao;
import com.historial.clinica.entity.Diagnostico;
import com.historial.clinica.service.DiagnosticoService;
@Service
public class DiagnosticoServiceImpl implements DiagnosticoService {

	@Autowired
	private DiagnosticoDao diagnosticoDao;
	@Override
	public Diagnostico create(Diagnostico d) {
		// TODO Auto-generated method stub
		return diagnosticoDao.create(d);
	}

	@Override
	public Diagnostico update(Diagnostico d) {
		// TODO Auto-generated method stub
		return diagnosticoDao.update(d);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		diagnosticoDao.delete(id);
	}

	@Override
	public Diagnostico read(Long id) {
		// TODO Auto-generated method stub
		return diagnosticoDao.read(id);
	}

	@Override
	public List<Diagnostico> readAll() {
		// TODO Auto-generated method stub
		return diagnosticoDao.readAll();
	}

}
