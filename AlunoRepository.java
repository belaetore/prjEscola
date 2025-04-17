package com.bebela.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bebela.demo.entities.Aluno;
public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	
}
