package com.ipartek.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipartek.modelo.EdadRecomendada;
import com.ipartek.modelo.repositorio.EdadesRecomendadasRepositorio;

import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;

@Service
public class InicializarDatos {
	@Autowired
	private EdadesRecomendadasRepositorio edadRecomendadaRepo;
	
	@PostConstruct
	@Transactional
	public void inicializarDatos() {
		
		edadRecomendadaRepo.save(new EdadRecomendada(1,"menores de 3 años"));
		edadRecomendadaRepo.save(new EdadRecomendada(2,"de 3 a 10 años"));
		edadRecomendadaRepo.save(new EdadRecomendada(3,"de 10 a 14 años"));
		edadRecomendadaRepo.save(new EdadRecomendada(4,"de 14 a 17 años"));
		edadRecomendadaRepo.save(new EdadRecomendada(5,"mayores de 18 años"));
		
	}
	
}
