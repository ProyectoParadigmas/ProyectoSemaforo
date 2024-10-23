package co.edu.poli.proyecto1.modelo;

import java.util.Arrays;

public class CentroDeControl {

 
    private String idCentroDeControl;

    @Override
	public String toString() {
		return "CentroDeControl [idCentroDeControl=" + idCentroDeControl + ", direccion=" + direccion + ", telefono="
				+ telefono + ", datosTrafico=" + Arrays.toString(datosTrafico) + ", semaforoInteligente="
				+ Arrays.toString(semaforoInteligente) + "]";
	}

	public String getIdCentroDeControl() {
		return idCentroDeControl;
	}

	public void setIdCentroDeControl(String idCentroDeControl) {
		this.idCentroDeControl = idCentroDeControl;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public DatosTrafico[] getDatosTrafico() {
		return datosTrafico;
	}

	public void setDatosTrafico(DatosTrafico[] datosTrafico) {
		this.datosTrafico = datosTrafico;
	}

	public SemaforoInteligente[] getSemaforoInteligente() {
		return semaforoInteligente;
	}

	public void setSemaforoInteligente(SemaforoInteligente[] semaforoInteligente) {
		this.semaforoInteligente = semaforoInteligente;
	}

	public CentroDeControl(String idCentroDeControl, String direccion, int telefono, DatosTrafico[] datosTrafico,
			SemaforoInteligente[] semaforoInteligente) {
		super();
		this.idCentroDeControl = idCentroDeControl;
		this.direccion = direccion;
		this.telefono = telefono;
		this.datosTrafico = datosTrafico;
		this.semaforoInteligente = semaforoInteligente;
	}

	/**
     * 
     */
    private String direccion;

    /**
     * 
     */
    private int telefono;

    /**
     * 
     */
    private DatosTrafico [ ] datosTrafico;

    /**
     * 
     */
    private SemaforoInteligente [ ] semaforoInteligente;

}