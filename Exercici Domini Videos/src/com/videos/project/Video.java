package com.videos.project;

import java.util.ArrayList;
import java.util.List;

public class Video {

	
	public String URL;
	public String titulo;
	public List<String> tags = new ArrayList<String>();

	public Video(String URL, String titulo) throws Exception {
		
	//Que no accepti camps buits
		
		if (titulo.equals(""))
			throw new Exception("Tienes que introducir un titulo");
		if (URL.equals(""))
			throw new Exception("Tienes que introducir un URL");
		
	this.titulo = titulo;
	this.URL = URL;
	
	}

	public void addtags(String askVideoTag) throws Exception {
		
		if (askVideoTag.equals(""))
			throw new Exception("Tienes que introducir un Tag");
		
		
		tags.add(askVideoTag);
		
		
	}
	
	//Per imprimimir
	public String getURL() {
		return new String(URL);
	}
	public String gettitulo() {
		return new String(titulo);
	}

}

