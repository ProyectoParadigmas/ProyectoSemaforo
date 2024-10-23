package co.edu.poli.proyecto1.modelo;


public class DatosTrafico {

  
    private String idTrafico;

    /**
     * 
     */
    private double flujoVehicular;

    /**
     * 
     */
    private double velocidadPromedio;

    /**
     * @param flujo 
     * @param velocidad 
     * @return
     */
    public void actualizarDatos(double flujo, double velocidad) {
        // TODO implement here
        return ;
    }

	public DatosTrafico(String idTrafico, double flujoVehicular, double velocidadPromedio) {
		super();
		this.idTrafico = idTrafico;
		this.flujoVehicular = flujoVehicular;
		this.velocidadPromedio = velocidadPromedio;
	}

	public String getIdTrafico() {
		return idTrafico;
	}

	public void setIdTrafico(String idTrafico) {
		this.idTrafico = idTrafico;
	}

	public double getFlujoVehicular() {
		return flujoVehicular;
	}

	public void setFlujoVehicular(double flujoVehicular) {
		this.flujoVehicular = flujoVehicular;
	}

	public double getVelocidadPromedio() {
		return velocidadPromedio;
	}

	public void setVelocidadPromedio(double velocidadPromedio) {
		this.velocidadPromedio = velocidadPromedio;
	}

	@Override
	public String toString() {
		return "DatosTrafico [idTrafico=" + idTrafico + ", flujoVehicular=" + flujoVehicular + ", velocidadPromedio="
				+ velocidadPromedio + "]";
	}

}