package com.historial.clinica.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.historial.clinica.dao.MedicoDao;
import com.historial.clinica.entity.Medico;
import com.historial.clinica.service.MedicoService;
@Service
public class MedicoServiceImpl implements MedicoService {

	@Autowired
	private MedicoDao medicoDao;
	@Override
	public Medico create(Medico m) {
		// TODO Auto-generated method stub
		return medicoDao.create(m);
	}

	@Override
	public Medico update(Medico m) {
		// TODO Auto-generated method stub
		return medicoDao.update(m);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		medicoDao.delete(id);
	}

	@Override
	public Medico read(Long id) {
		// TODO Auto-generated method stub
		return medicoDao.read(id);
	}

	@Override
	public List<Medico> readAll() {
		// TODO Auto-generated method stub
		return medicoDao.readAll();
	}

	@Override
	public List<Medico> searchMedico(String filtro) {
		// TODO Auto-generated method stub
		return medicoDao.searchMedico(filtro);
	}

}
