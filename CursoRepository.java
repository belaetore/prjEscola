package com.bebela.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bebela.demo.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{
	
}
