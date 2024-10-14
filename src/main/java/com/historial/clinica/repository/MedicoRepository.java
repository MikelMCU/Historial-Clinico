package com.historial.clinica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.historial.clinica.entity.Medico;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long>{
	@Query(
		    value = "SELECT * FROM medicos WHERE medicos.nombres LIKE CONCAT ('%', :filtro, '%')",
		    nativeQuery = true
		)
		List<Medico> searchNative(@Param("filtro") String filtro);
}
