package com.example.demo.Entities;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor; 

@Entity
@Data
@NoArgsConstructor
public class Banque {
	@Id
    private String nom;
    
 @OneToMany(mappedBy="Banque") 
 public Collection<Compte> Comptes = new HashSet<Compte>();
 
 public Compte chercherCompte(long num) { 
	 for (Compte c : Comptes) {
		 if (c.getNumCompte() == num) 
			 return c; 
		 } 
	 return null; 
		 }
 
 

public Compte chercherCompte1(long idf, String pwd) {
	Compte c = chercherCompte(idf);
	 if (c != null && c.getMotDePasse().equals(pwd)) 
		 return c;
	 else return null; 
	 }



}
   

