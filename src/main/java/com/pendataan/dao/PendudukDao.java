package com.pendataan.dao;

import org.springframework.data.repository.CrudRepository;

import com.pendataan.model.Penduduk;

public interface PendudukDao extends CrudRepository<Penduduk, Integer>{
	
}
