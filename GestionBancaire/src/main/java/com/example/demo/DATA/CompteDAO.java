package com.example.demo.DATA;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Compte;

public interface CompteDAO extends JpaRepository<Compte, Long> {
	List<Compte> findAll();
}
