package com.login.controllers;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.annotation.PostConstruct;

@RequestScoped
@Named(value="userBean")
public class UserBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String nome;
	
	@PostConstruct
	public void start(){
		
		this.nome = FacesContext.
								getCurrentInstance().
								getExternalContext().
								getRequestParameterMap().
								get("nome").
								toString();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
