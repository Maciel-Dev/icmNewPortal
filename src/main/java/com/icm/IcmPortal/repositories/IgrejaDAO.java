package com.icm.IcmPortal.repositories;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.icm.IcmPortal.models.Igreja;

public interface IgrejaDAO extends JpaRepository<Igreja, Integer> {
	
	@Query(value = "SELECT * FROM igreja where nome = ?1")
	List<Igreja> findByNome(@Param("nome") String nome);
	
}


