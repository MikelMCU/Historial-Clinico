package com.historial.clinica.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.historial.clinica.dao.MedicoDao;
import com.historial.clinica.entity.Medico;
import com.historial.clinica.repository.MedicoRepository;
@Component
public class MedicoDaoImpl implements MedicoDao {

	@Autowired
	private MedicoRepository medicoRepository;
	@Override
	public Medico create(Medico m) {
		// TODO Auto-generated method stub
		return medicoRepository.save(m);
	}

	@Override
	public Medico update(Medico m) {
		// TODO Auto-generated method stub
		return medicoRepository.save(m);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		medicoRepository.deleteById(id);
	}

	@Override
	public Medico read(Long id) {
		// TODO Auto-generated method stub
		return medicoRepository.findById(id).get();
	}

	@Override
	public List<Medico> readAll() {
		// TODO Auto-generated method stub
		return medicoRepository.findAll();
	}

	@Override
	public List<Medico> searchMedico(String filtro) {
		// TODO Auto-generated method stub
		return medicoRepository.searchNative(filtro);
	}


}
