package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.DATA.CompteDAO;
import com.example.demo.Entities.Compte;



@SpringBootApplication
public class GestionBancaireApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(GestionBancaireApplication.class, args);
		CompteDAO obj=ctx.getBean(CompteDAO.class);
		Compte c1= new Compte(12345,0022,"ali","abcd");
		obj.save(c1);
		Compte c2= new Compte(456852,7702,"alia","bjsie");
		obj.save(c2);
		Compte c3= new Compte(951753,3350,"celine","polpo");
		obj.save(c3);
		List<Compte>comptes=obj.findAll();
		 for(Compte c:comptes) {
			 System.out.println("Compte:"+c.toString());
		 }
	}

}
