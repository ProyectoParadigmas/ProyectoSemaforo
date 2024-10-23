package co.edu.poli.proyecto1.modelo;


public class Sensor {

 
    private String idSensor;

    /**
     * 
     */
    private String tipoSensor;

	public Sensor(String idSensor, String tipoSensor) {
		super();
		this.idSensor = idSensor;
		this.tipoSensor = tipoSensor;
	}

	public String getIdSensor() {
		return idSensor;
	}

	public void setIdSensor(String idSensor) {
		this.idSensor = idSensor;
	}

	public String getTipoSensor() {
		return tipoSensor;
	}

	public void setTipoSensor(String tipoSensor) {
		this.tipoSensor = tipoSensor;
	}

	@Override
	public String toString() {
		return "Sensor [idSensor=" + idSensor + ", tipoSensor=" + tipoSensor + "]";
	}

}