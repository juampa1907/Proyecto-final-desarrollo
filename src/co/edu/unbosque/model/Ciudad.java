package co.edu.unbosque.model;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Ciudad {
    private int filas;
    private int columnas;
    private String[][] matriz;
    private int turnoActual;
    private List<Carro> carros;
    private List<Semaforo> semaforos;
    private Random rand;

    public Ciudad(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.turnoActual = 0;
        this.matriz = new String[filas][columnas];
        this.carros = new ArrayList<>();
        this.semaforos = new ArrayList<>();
        this.rand = new Random();
        inicializar();
    }

    private void inicializar() {
        // Limpiar matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = " ";
            }
        }
        
        // Agregar vehículo
        Carro v = new Carro(1, new Coordenada(0, 0), "Avanzando");
        carros.add(v);
        matriz[0][0] = "V";

        // Agregar semáforo
        Semaforo s = new Semaforo(new Coordenada(0, 2));
        semaforos.add(s);
        matriz[0][2] = "S";
    }

    public void simularTurno() {
        turnoActual++;

        // Cambiar semáforos
        for (Semaforo s : semaforos) {
            s.cambiarEstado();
        }

        // Limpiar matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (!matriz[i][j].equals("S")) matriz[i][j] = " ";
            }
        }

        // Mover vehículos
        for (Carro v : carros) {
            Coordenada pos = v.getPosicion();
            int fila = pos.getFila();
            int col = pos.getColumna();

            boolean semaforoRojo = false;
            for (Semaforo s : semaforos) {
                Coordenada ub = s.getUbicacion();
                if (ub.getFila() == fila && ub.getColumna() == col + 1 && s.esRojo()) {
                    semaforoRojo = true;
                    break;
                }
            }

            if (!semaforoRojo && col + 1 < columnas) {
                v.avanzar();
            } else {
                v.detener();
            }

            Coordenada nueva = v.getPosicion();
            matriz[nueva.getFila()][nueva.getColumna()] = "V";
        }
    }

    public String[][] getMatriz() {
        return matriz;
    }
}

