package com.example.demo.Entities;

import java.util.Collection;
import java.util.Date;

import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;

import java.util.HashSet;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "Operation")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
 
public class Operation {
   @Id
   @GeneratedValue
   
	private float montantOperation; 
	
   private String typeOperation;
	private Date dateop;
	
	@OneToMany(mappedBy = "Operation")
	private Collection<Compte> comptes = new HashSet<Compte>();
  
	public Operation(float montantOperation ,String typeOperation, Date dateop) {
		super();
		this.montantOperation = montantOperation;
		this.typeOperation = typeOperation;
		this.dateop=dateop;
	}


}
