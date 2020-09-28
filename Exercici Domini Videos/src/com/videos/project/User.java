package com.videos.project;

import java.util.Date;

public class User {

	public String Nom;
	public String Cognom;
	public String Password;
	public Date RegistrationDate = new Date();
	
	public User (String Nom, String Cognom, String Password) throws Exception {
		
		//Que no accepti camps buits
		
		if (Nom.equals(""))
			throw new Exception("Tienes que introducir un nombre");
		if (Cognom.equals(""))
			throw new Exception("Tienes que introducir un apellido");
		if (Password.equals(""))
			throw new Exception("Tienes que introducir una contraseña");
		
		this.Nom = Nom;
		this.Cognom = Cognom;
		this.Password = Password;
		java.util.Date Today = new Date();
		this.RegistrationDate = Today;
}
}
