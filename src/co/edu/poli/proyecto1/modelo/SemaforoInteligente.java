package co.edu.poli.proyecto1.modelo;

import java.io.*;
import java.util.*;

/**
 * 
 */
public abstract class SemaforoInteligente {

    /**
     * Default constructor
     */
    public SemaforoInteligente() {
    }

    /**
     * 
     */
    private int idSemaforo;

    /**
     * 
     */
    private String ubicacion;

    /**
     * 
     */
    private String estado;

    /**
     * 
     */
    private Sensor [ ] sensor;

    /**
     * @param nuevoEstado 
     * @return
     */
    public void cambiarEstado(String nuevoEstado) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void recopilarDatos() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public void ajustarTiempoLuz() {
        // TODO implement here
        return null;
    }

    /**
     * @param tipoEvento 
     * @return
     */
    protected void registrarEvento(String tipoEvento) {
        // TODO implement here
        return null;
    }

    /**
     * @param tipoEvento 
     * @param tiempoReal 
     * @return
     */
    protected void registrarEvento(String tipoEvento, double tiempoReal) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public abstract String describirSemaforoInteligente();

}