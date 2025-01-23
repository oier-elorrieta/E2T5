package Pojoak;

public class AeroportuPOJO {
	 public static class Aereportu {
	        
	        private String izena;
	        private String kokapena;

	       
	        public Aereportu(String izena, String kokapena) {
	            this.izena = izena;
	            this.kokapena = kokapena;
	        }

	        
	        public String getIzena() {
	            return izena;
	        }

	        public void setIzena(String izena) {
	            this.izena = izena;
	        }

	        public String getKokapena() {
	            return kokapena;
	        }

	        public void setKokapena(String kokapena) {
	            this.kokapena = kokapena;
	        }


			@Override
			public String toString() {
				return "Aereportu [izena=" + izena + ", kokapena=" + kokapena + "]";
			}
	        
	    }
}
