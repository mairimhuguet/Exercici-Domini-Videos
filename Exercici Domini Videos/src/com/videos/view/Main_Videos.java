package com.videos.view;

import javax.swing.JOptionPane;

import com.videos.project.User;
import com.videos.project.Video;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main_Videos {

	public static void main(String[] args) throws Exception {
		
		
		//Demanar a l'usuari les seves dades
		
		String askuser [] = new String [3];
		askuser[0] = JOptionPane.showInputDialog("Introduce tu nombre");
		askuser[1] = JOptionPane.showInputDialog("Introduce tu apellido");
		askuser[2] = JOptionPane.showInputDialog("Introduce tu contraseña");

		//CREAR USER
		
		User user1 = new User (askuser[0], askuser[1], askuser[2]);
		
		//Imprimir dades usuari
		
		System.out.println("Bienvenido. Te has registrado a las " + user1.RegistrationDate); 
		System.out.println("Nombre y apellido: " + user1.Nom + " " + user1.Cognom);
		System.out.println("Su contraseña es: "+ user1.Password);
	
				
		//Demanar a l'usuari que fiqui la informació dels videos
		
		
		int UsuarioIntroduceVideo;
		do {
		String AskVideoData [] = new String [2];
		AskVideoData[0] = JOptionPane.showInputDialog("Introduce URL del video");
		AskVideoData[1] = JOptionPane.showInputDialog("Introduce titulo del video");
		
		//CREAR VIDEO
		
		Video video1 = new Video (AskVideoData[0], AskVideoData[1]);
		
		
		//Demanar a l'usuari que fiqui els tags
		
		int UsuarioIntroduceTag;
		do {
			String AskVideoTag = JOptionPane.showInputDialog("Introduce un tag para el video");

			video1.addtags(AskVideoTag);	
			UsuarioIntroduceTag = JOptionPane.showConfirmDialog(null, "Quieres introducir otro tag?", null, JOptionPane.YES_NO_OPTION);
			
		} while (UsuarioIntroduceTag==0);
		
		//Imprimir propietats del video
		
		System.out.println("Nuevo video. Titulo: " + video1.titulo + ". URL: " + video1.URL + ". Tags: " + video1.tags);
		
		
		
	
	//Demanar a l'usuari si vol crear un altre video
	
			
			UsuarioIntroduceVideo = JOptionPane.showConfirmDialog(null, "Quieres introducir otro video?", null, JOptionPane.YES_NO_OPTION);
			} while (UsuarioIntroduceVideo==0);
		
}
}
	
		
	

	


	
	


