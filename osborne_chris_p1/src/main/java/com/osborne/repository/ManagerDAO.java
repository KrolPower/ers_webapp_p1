package com.osborne.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.osborne.model.Manager;


@Repository
public interface ManagerDAO extends JpaRepository<Manager, Long>{
	
	
}
