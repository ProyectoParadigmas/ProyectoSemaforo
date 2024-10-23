package co.edu.poli.proyecto1.modelo;


public class SemaforoPeatonal extends SemaforoInteligente {

   
    private double tiempoVerdePeaton;

    /**
     * 
     */
    private double tiempoRojoPeaton;

	public SemaforoPeatonal(int idSemaforo, String ubicacion, String estado, Sensor[] sensor, double tiempoVerdePeaton,
			double tiempoRojoPeaton) {
		super(idSemaforo, ubicacion, estado, sensor);
		this.tiempoVerdePeaton = tiempoVerdePeaton;
		this.tiempoRojoPeaton = tiempoRojoPeaton;
	}

	public double getTiempoVerdePeaton() {
		return tiempoVerdePeaton;
	}

	public void setTiempoVerdePeaton(double tiempoVerdePeaton) {
		this.tiempoVerdePeaton = tiempoVerdePeaton;
	}

	public double getTiempoRojoPeaton() {
		return tiempoRojoPeaton;
	}

	public void setTiempoRojoPeaton(double tiempoRojoPeaton) {
		this.tiempoRojoPeaton = tiempoRojoPeaton;
	}

	@Override
	public String toString() {
		return "SemaforoPeatonal [tiempoVerdePeaton=" + tiempoVerdePeaton + ", tiempoRojoPeaton=" + tiempoRojoPeaton
				+ "]";
	}

}