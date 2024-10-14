package com.historial.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.historial.clinica.entity.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long>{

}
