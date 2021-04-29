package com.example.demo.Controler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Entities.Banque;
import com.example.demo.Entities.Compte;

@Controller
public class Controler {
	Banque bq = new Banque();
	
	@RequestMapping(value = "/Biat", method = RequestMethod.GET) 
	public String action1() { 
		return "accueil.html"; 
		}
	
	@RequestMapping(value="/ajouter",method=RequestMethod.GET)
	public String action2() {
		return"ajoutcompte.html";
	}
	
	@RequestMapping(value="/connexion",method=RequestMethod.GET)
	public String action3() {
		return"connexion.html";
	}
	
	@RequestMapping(value="/connexion", method=RequestMethod.GET)
	public String action4(HttpServletRequest request, @RequestParam(name="login")long idf ,
			@RequestParam(name="mdp")String pwd, Model model) {
		Compte c = bq.chercherCompte1(idf, pwd);
		model.addAttribute("monCompte", c);
		if (c != null) { 
			HttpSession session = request.getSession(true);
		session.setAttribute("monCompte", c);
		return "listeopcomptecourant.html"; } else
			return "connexion.html";
		}
	
	@RequestMapping(value="/ajoutop", method=RequestMethod.GET)
	public String action5() {
		return "ajoutcompte.html";
		}
	
	
	
	


}
