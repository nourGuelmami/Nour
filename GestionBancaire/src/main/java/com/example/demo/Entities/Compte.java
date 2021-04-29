package com.example.demo.Entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="Compte")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Compte implements Serializable {
	      @Id
	      @GeneratedValue
	   private long numCompte; 
	   private float solde; 
	   private String nomClient; 
	   private String motDePasse; 
	   
	
	@OneToMany(mappedBy = "Compte")
	public Collection<Operation> Operations = new HashSet<Operation>();
  
	
	
	@ManyToOne
	private Banque banque;
	//@JoinColumn(name = "id_banque")
	
	
	public Compte(long numCompte, float solde, String nomClient, String motDePasse) { 
		super(); 
		this.numCompte=numCompte;
		this.solde=solde; 
		this.nomClient=nomClient; 
		this.motDePasse=motDePasse; 
		}


	public long getNumCompte() {
		// TODO Auto-generated method stub
		return this.numCompte;
	}


	public Object getMotDePasse() {
		// TODO Auto-generated method stub
		return this.motDePasse;
	}
	


	
}
