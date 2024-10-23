package co.edu.poli.proyecto1.modelo;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class SemaforoPeatonal extends SemaforoInteligente {

    /**
     * Default constructor
     */
    public SemaforoPeatonal() {
    }

    /**
     * 
     */
    private double tiempoVerdePeaton;

    /**
     * 
     */
    private double tiempoRojoPeaton;

    /**
     * @return
     */
    public abstract String describirSemaforoInteligente();

}