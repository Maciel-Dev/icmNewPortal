package com.icm.IcmPortal.repositories;

import com.icm.IcmPortal.models.Comentario;
import com.icm.IcmPortal.models.Igreja;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ComentariosDAO extends JpaRepository<Comentario, Integer> {

    List<Comentario> findByUsuarioId(int id_usuario);
	
}


