package com.mycompany.model;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class LibrosBean {

	private List<Libro> libros;
	
	public LibrosBean(){
		this.libros = new ArrayList<>();
		this.libros.add(new Libro("titulo 1", "autor 1"));
		this.libros.add(new Libro("titulo 2", "autor 2"));
		this.libros.add(new Libro("titulo 3", "autor 3"));
		this.libros.add(new Libro("titulo 4", "autor 4"));
		this.libros.add(new Libro("titulo 5", "autor 5"));
		
	}

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}
	
}
