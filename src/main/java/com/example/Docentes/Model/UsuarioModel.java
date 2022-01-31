package com.example.Docentes.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class UsuarioModel {
	
	private static final long serialversionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long usuario_id;
	
	@NotBlank(message = "Não pode ser NUllo ou vazio")
	@Size(min =7)
	@Column(unique = true)
	private String userName;
	
	@NotBlank(message = "Não pode ser NUllo ou vazio")
	@Size(min= 8)
	@Column(unique = true)
	private String password;
	
	@NotBlank(message = "Não pode ser NUllo ou vazio")
	@Size(min= 8)
	@Column(unique = true)
	private String email;

	public long getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(long usuario_id) {
		this.usuario_id = usuario_id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
