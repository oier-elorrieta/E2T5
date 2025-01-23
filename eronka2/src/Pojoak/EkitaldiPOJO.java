package Pojoak;

public class EkitaldiPOJO {
	 public static class Ekitaldi {
	        
	        private String izena;
	        private String deskribapena;

	        
	        public Ekitaldi(String izena, String deskribapena) {
	            this.izena = izena;
	            this.deskribapena = deskribapena;
	        }

	        
	        public String getIzena() {
	            return izena;
	        }

	        public void setIzena(String izena) {
	            this.izena = izena;
	        }

	        public String getDeskribapena() {
	            return deskribapena;
	        }

	        public void setDeskribapena(String deskribapena) {
	            this.deskribapena = deskribapena;
	        }
	    }
}
