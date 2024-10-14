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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.historial.clinica.entity.Medico;
import com.historial.clinica.service.MedicoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/medicos")
public class MedicoController {
	@Autowired
	private MedicoService medicoService;
	
	@GetMapping
	public ResponseEntity<List<Medico>>readAll(){
		try {
			List<Medico>medicos=medicoService.readAll();
			if (medicos.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(medicos,HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@PostMapping
	public ResponseEntity<Medico>create(@Valid @RequestBody Medico med){
		try {
			Medico m=medicoService.create(med);
			return new ResponseEntity<>(m,HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Medico>getMedicoId(@PathVariable("id") Long id){
		try {
			Medico m=medicoService.read(id);
			return new ResponseEntity<>(m,HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Medico>delMedico(@PathVariable("id") Long id){
		try {
			medicoService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Medico>updateMedico(@PathVariable("id") Long id,@Valid @RequestBody Medico med){
		Medico m=medicoService.read(id);
		if (m.getId()>0) {
			return new ResponseEntity<>(medicoService.update(med),HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	@GetMapping("/search")
    public ResponseEntity<List<Medico>> buscarMedico(@RequestParam String filtro) {
        try {
            List<Medico> medicos = medicoService.searchMedico(filtro);
            return ResponseEntity.ok(medicos);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}