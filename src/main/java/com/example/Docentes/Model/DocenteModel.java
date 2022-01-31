package com.example.Docentes.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

@Entity
public class DocenteModel {
	
	private static final long serialversionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long docente_id;
	
	@Size(min = 2)
	@NotBlank(message = "Não pode ser NUllo ou vazio")
	private String Nome;
	
	
	@NotNull
	private byte idade;
	
	@Length(min= 7)
	@NotBlank(message = "Não pode ser NUllo ou vazio")
	private String disciplina;

	public long getDocente_id() {
		return docente_id;
	}

	public void setDocente_id(long docente_id) {
		this.docente_id = docente_id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public byte getIdade() {
		return idade;
	}

	public void setIdade(byte idade) {
		this.idade = idade;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	
}
