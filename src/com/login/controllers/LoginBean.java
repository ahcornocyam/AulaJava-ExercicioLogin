package com.login.controllers;

import java.io.IOException;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@RequestScoped
@Named(value="loginBean")
public class LoginBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String user;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
	public void redirect(){
		try {
			FacesContext.
						getCurrentInstance().
						getExternalContext().
						redirect("bemvindo.xhtml?nome=".
														concat(this.user)
								);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	


}
