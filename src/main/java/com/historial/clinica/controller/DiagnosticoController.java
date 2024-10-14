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

import com.historial.clinica.entity.Diagnostico;
import com.historial.clinica.service.DiagnosticoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/diagnosticos")
public class DiagnosticoController {
	@Autowired
	private DiagnosticoService diagnosticoService;
	
	@GetMapping
	public ResponseEntity<List<Diagnostico>>readAll(){
		try {
			List<Diagnostico>diagnosticos=diagnosticoService.readAll();
			if (diagnosticos.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(diagnosticos,HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<Diagnostico>create(@Valid @RequestBody Diagnostico dia){
		try {
			Diagnostico d=diagnosticoService.create(dia);
			return new ResponseEntity<>(d,HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Diagnostico>GetDiagnosticoId(@PathVariable("id") Long id){
		try {
			Diagnostico d=diagnosticoService.read(id);
			return new ResponseEntity<>(d,HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Diagnostico>delDiagnostico(@PathVariable("id") Long id){
		try {
			diagnosticoService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Diagnostico>updateDiagnostico(@PathVariable("id") Long id,@Valid @RequestBody Diagnostico dia){
		Diagnostico d=diagnosticoService.read(id);
		if (d.getId()>0) {
			return new ResponseEntity<>(diagnosticoService.update(dia),HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
}
