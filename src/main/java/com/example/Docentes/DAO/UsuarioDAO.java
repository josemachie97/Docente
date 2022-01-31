package com.example.Docentes.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Docentes.Model.UsuarioModel;

@Repository
public interface UsuarioDAO extends JpaRepository<UsuarioModel, Long> {
	
	@Query("select u from UsuarioModel u where u.userName= :userName")
	public UsuarioModel findbyUsername(String userName);

}
