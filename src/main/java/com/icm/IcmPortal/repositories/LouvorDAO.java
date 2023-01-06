package com.icm.IcmPortal.repositories;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.icm.IcmPortal.models.Louvor;

public interface LouvorDAO extends JpaRepository<Louvor, Integer> {
	
	@Query(value = "SELECT * FROM louvor where numero = ?1")
	List<Louvor> findByNumero(@Param("numero") int numero);
	
}


