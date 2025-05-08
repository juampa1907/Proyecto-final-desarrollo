package co.edu.unbosque.model;

import java.util.List;

public class Calle {

	private Coordenada inicio;
	private Coordenada fin;
	private String direccion;
	private List<Evento> eventos;
	
	
	public Calle(Coordenada inicio, Coordenada fin, String direccion, List<Evento> eventos) {
		super();
		this.inicio = inicio;
		this.fin = fin;
		this.direccion = direccion;
		this.eventos = eventos;
	}
	public Coordenada getInicio() {
		return inicio;
	}
	public void setInicio(Coordenada inicio) {
		this.inicio = inicio;
	}
	public Coordenada getFin() {
		return fin;
	}
	public void setFin(Coordenada fin) {
		this.fin = fin;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public List<Evento> getEventos() {
		return eventos;
	}
	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}

}
