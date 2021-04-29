package com.example.demo.Entities;

import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.Id;
import java.io.Serializable;

@IdClass(Cle.class)
@Entity
public class Contenir implements Serializable {
	public int nbrOperation;
	@Id
	@ManyToOne
	@JoinColumn(name = "id_Compte")
	public Compte comptes;

	
	@Id
	@ManyToOne
	@JoinColumn(name = "id_operation")
	public Operation operations;

	
	public Contenir (int nbrOperation, Operation operations, Compte comptes) {
		super();
		this.nbrOperation = nbrOperation;
		this.operations = operations;
		this.comptes = comptes;
	}

}
