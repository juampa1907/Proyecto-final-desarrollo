package co.edu.unbosque.controller;

import co.edu.unbosque.model.Ciudad;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller {
	
	public void ejecutar() {
		Controller();
	}
	
	private void Controller() {
		VentanaPrincipal view = new VentanaPrincipal();
		Ciudad ciudad = new Ciudad(5, 5);
	}
}
