package com.icm.IcmPortal.repositories;

import org.springframework.data.repository.CrudRepository;

import com.icm.IcmPortal.models.Usuario;

import java.util.Optional;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {
	
	Usuario findByEmail(String email);


}


