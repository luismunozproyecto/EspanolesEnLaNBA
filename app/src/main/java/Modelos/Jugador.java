package Modelos;

import android.content.Context;

import java.net.URL;
import java.util.ArrayList;


public class Jugador {

    int id;
    int dorsal;
    String nombre;
    String imagen_cabecera;
    ArrayList<Estadistica> estadisticas=new ArrayList<>();


    public Jugador(int id, int dorsal, String nombre, String imagen_cabecera) {
        this.id = id;
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.imagen_cabecera=imagen_cabecera;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estadistica> getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(ArrayList<Estadistica> estadisticas) {
        this.estadisticas = estadisticas;
    }

    public String getImagen_cabecera() {
        return imagen_cabecera;
    }

    public void setImagen_cabecera(String imagen_cabecera) {
        this.imagen_cabecera = imagen_cabecera;
    }
}
