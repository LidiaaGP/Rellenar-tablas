package com.ipartek.modelo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ipartek.modelo.EdadRecomendada;

@Repository
public interface EdadesRecomendadasRepositorio extends JpaRepository<EdadRecomendada, Integer>{
	
}
