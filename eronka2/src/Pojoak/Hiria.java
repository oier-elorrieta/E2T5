package Pojoak;

public class Hiria {
	 
	        
	        private String izena;
	        private int biztanleria;

	        
	        public Hiria(String izena, int biztanleria) {
	            this.izena = izena;
	            this.biztanleria = biztanleria;
	        }

	        
	        public String getIzena() {
	            return izena;
	        }

	        public void setIzena(String izena) {
	            this.izena = izena;
	        }

	        public int getBiztanleria() {
	            return biztanleria;
	        }

	        public void setBiztanleria(int biztanleria) {
	            this.biztanleria = biztanleria;
	        }


			@Override
			public String toString() {
				return "Hiria [izena=" + izena + ", biztanleria=" + biztanleria + "]";
			}
	        
	    }

