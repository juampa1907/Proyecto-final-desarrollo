package co.edu.unbosque.controller;

import co.edu.unbosque.model.Ciudad;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller {
	
	private Ciudad ciudad;
    private VentanaPrincipal vista;
	
	public void ejecutar() {
		Controller();
	}
	
    public void Controller() {
        this.ciudad = new Ciudad(5, 5);
        this.vista = new VentanaPrincipal(() -> simularTurno());
        this.vista.setVisible(true);
    }

    public void simularTurno() {
        ciudad.simularTurno();
        vista.actualizarVista(ciudad.getMatriz());
    }
}
