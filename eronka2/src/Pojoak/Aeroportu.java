package Pojoak;

public class Aeroportu {
		    
	private String kodeAeroportu;
	private String izena;
	        
	 	public Aeroportu(String kodeAeroportu, String izena ) {
	 		this.izena = izena;
	        this.kodeAeroportu = kodeAeroportu;
	    }
	 	public String getIzena() {
	 		return izena;
	 	}
	 	public void setIzena(String izena) {
	 		this.izena = izena;
	 	}
	 	public String getkodeAeroportu() {
	 		return kodeAeroportu;
	 	}
	 	public void setkodeAeroportu(String kodeAeroportu) {
	 		this.kodeAeroportu = kodeAeroportu;
	 	}
	 	@Override
	 	public String toString() {
	 		return "Aereportu [izena=" + izena + ", kode Aeroportu=" + kodeAeroportu + "]";
	 	}
	        
	    
}
