package co.edu.poli.proyecto1.modelo;

import java.util.Arrays;

public class SemaforoInteligente {

 
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
        return ;
    }

    /**
     * @return
     */
    public void recopilarDatos() {
        // TODO implement here
        return ;
    }

    /**
     * @return
     */
    public void ajustarTiempoLuz() {
        // TODO implement here
        return ;
    }

	public SemaforoInteligente(int idSemaforo, String ubicacion, String estado, Sensor[] sensor) {
		super();
		this.idSemaforo = idSemaforo;
		this.ubicacion = ubicacion;
		this.estado = estado;
		this.sensor = sensor;
	}

	public int getIdSemaforo() {
		return idSemaforo;
	}

	public void setIdSemaforo(int idSemaforo) {
		this.idSemaforo = idSemaforo;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Sensor[] getSensor() {
		return sensor;
	}

	public void setSensor(Sensor[] sensor) {
		this.sensor = sensor;
	}

	@Override
	public String toString() {
		return "SemaforoInteligente [idSemaforo=" + idSemaforo + ", ubicacion=" + ubicacion + ", estado=" + estado
				+ ", sensor=" + Arrays.toString(sensor) + "]";
	}

}