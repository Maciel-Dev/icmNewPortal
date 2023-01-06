package com.icm.IcmPortal.repositories;

import org.springframework.data.repository.CrudRepository;

import com.icm.IcmPortal.models.Membro;

public interface UsuarioDAO extends CrudRepository<Membro, Integer> {

}


