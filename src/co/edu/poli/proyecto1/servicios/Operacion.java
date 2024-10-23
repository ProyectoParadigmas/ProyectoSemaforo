package co.edu.poli.proyecto1.servicios;

import co.edu.poli.proyecto1.modelo.SemaforoInteligente;

import java.io.*;
import java.util.*;

/**
 * 
 */
public interface Operacion {

    /**
     * @param x 
     * @return
     */
    public String create(SemaforoInteligente x);

    /**
     * @param String id 
     * @return
     */
    public SemaforoInteligente read(void String id);

    /**
     * @param String id 
     * @param SemaforoInteligente nuevoSemaforo 
     * @return
     */
    public String update(void String id, void SemaforoInteligente nuevoSemaforo);

    /**
     * @param String id 
     * @return
     */
    public String delete(void String id);

    /**
     * @param SemaforoInteligente[] semaforo 
     * @param String name 
     * @return
     */
    public String serializar(void SemaforoInteligente[] semaforo, void String name);

    /**
     * @param String path 
     * @param String name 
     * @return
     */
    public SemaforoInteligente deserializar(void String path, void String name);

}