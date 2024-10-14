package com.historial.clinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.historial.clinica.entity.Especialidad;
import com.historial.clinica.service.EspecialidadService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/especialidades")
public class EspecialidadController {
	@Autowired
	private EspecialidadService especialidadService;
	
	@GetMapping
	public ResponseEntity<List<Especialidad>>readAll(){
		try {
			List<Especialidad>especialidades=especialidadService.readAll();
			if (especialidades.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(especialidades,HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<Especialidad>create(@Valid @RequestBody Especialidad esp){
		try {
			Especialidad e=especialidadService.create(esp);
			return new ResponseEntity<>(e,HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Especialidad>getEspecialidadId(@PathVariable("id") Long id){
		try {
			Especialidad e=especialidadService.read(id);
			return new ResponseEntity<>(e,HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Especialidad>delEspecialidad(@PathVariable("id") Long id){
		try {
			especialidadService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Especialidad>updateEspecialidad(@PathVariable("id") Long id,@Valid @RequestBody Especialidad esp){
		Especialidad e=especialidadService.read(id);
		if (e.getId()>0) {
			return new ResponseEntity<>(especialidadService.update(esp),HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
}