package com.icm.IcmPortal.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
@Table(name = "Comentario")
public class Comentario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name = "comentarioEBD")
	private String comentarioEBD;

	@Column(name = "Usuario_ID")
	private int usuario_id;

	public int getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}

	public String getComentarioEBD() {
		return comentarioEBD;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setComentarioEBD(String comentarioEBD) {
		this.comentarioEBD = comentarioEBD;
	}
}
