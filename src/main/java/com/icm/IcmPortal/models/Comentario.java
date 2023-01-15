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
	private int Usuario_ID;

	public int getUsuario_ID() {
		return Usuario_ID;
	}

	public void setUsuario_ID(int usuario_ID) {
		Usuario_ID = usuario_ID;
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
