package co.edu.poli.proyecto1.modelo;


public class SemaforoVehicular extends SemaforoInteligente {

  
    private int numeroCarriles;

	public SemaforoVehicular(int idSemaforo, String ubicacion, String estado, Sensor[] sensor, int numeroCarriles) {
		super(idSemaforo, ubicacion, estado, sensor);
		this.numeroCarriles = numeroCarriles;
	}

	public int getNumeroCarriles() {
		return numeroCarriles;
	}

	public void setNumeroCarriles(int numeroCarriles) {
		this.numeroCarriles = numeroCarriles;
	}

	@Override
	public String toString() {
		return "SemaforoVehicular [numeroCarriles=" + numeroCarriles + "]";
	}

}