package com.example.Docentes.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Docentes.Model.DocenteModel;

@Repository
public interface DocenteDAO extends JpaRepository<DocenteModel, Long> {

}
