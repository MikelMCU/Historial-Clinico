package com.historial.clinica.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.historial.clinica.dao.EspecialidadDao;
import com.historial.clinica.entity.Especialidad;
import com.historial.clinica.repository.EspecialidadRepository;
@Component
public class EspecialidadDaoImpl implements EspecialidadDao {

	@Autowired
	private EspecialidadRepository especialidadRepository;
	@Override
	public Especialidad create(Especialidad e) {
		// TODO Auto-generated method stub
		return especialidadRepository.save(e);
	}

	@Override
	public Especialidad update(Especialidad e) {
		// TODO Auto-generated method stub
		return especialidadRepository.save(e);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		especialidadRepository.deleteById(id);
	}

	@Override
	public Especialidad read(Long id) {
		// TODO Auto-generated method stub
		return especialidadRepository.findById(id).get();
	}

	@Override
	public List<Especialidad> readAll() {
		// TODO Auto-generated method stub
		return especialidadRepository.findAll();
	}

}
