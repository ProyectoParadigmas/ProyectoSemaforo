package co.edu.poli.proyecto1.servicios;

import co.edu.poli.proyecto1.modelo.SemaforoInteligente;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class ImplementacionOperacion implements Operacion {

    /**
     * Default constructor
     */
    public ImplementacionOperacion() {
    }

    /**
     * 
     */
    public SemaforoInteligente [ ] semaforoPeatonal;

    /**
     * @param x 
     * @return
     */
    public String create(SemaforoInteligente x) {
        // TODO implement Operacion.create() here
        return "";
    }

    /**
     * @param String id 
     * @return
     */
    public SemaforoInteligente read(void String id) {
        // TODO implement Operacion.read() here
        return null;
    }

    /**
     * @param String id 
     * @param SemaforoInteligente nuevoSemaforo 
     * @return
     */
    public String update(void String id, void SemaforoInteligente nuevoSemaforo) {
        // TODO implement Operacion.update() here
        return "";
    }

    /**
     * @param String id 
     * @return
     */
    public String delete(void String id) {
        // TODO implement Operacion.delete() here
        return "";
    }

    /**
     * @param SemaforoInteligente[] semaforo 
     * @param String name 
     * @return
     */
    public String serializar(void SemaforoInteligente[] semaforo, void String name) {
        // TODO implement Operacion.serializar() here
        return "";
    }

    /**
     * @param String path 
     * @param String name 
     * @return
     */
    public SemaforoInteligente deserializar(void String path, void String name) {
        // TODO implement Operacion.deserializar() here
        return null;
    }

}