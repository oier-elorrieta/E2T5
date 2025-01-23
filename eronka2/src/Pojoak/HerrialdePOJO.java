package Pojoak;

public class HerrialdePOJO {
public static class Herrialde {
        
        private String izena;
        private String hizkuntza;

        
        public Herrialde(String izena, String hizkuntza) {
            this.izena = izena;
            this.hizkuntza = hizkuntza;
        }

        
        public String getIzena() {
            return izena;
        }

        public void setIzena(String izena) {
            this.izena = izena;
        }

        public String getHizkuntza() {
            return hizkuntza;
        }

        public void setHizkuntza(String hizkuntza) {
            this.hizkuntza = hizkuntza;
        }


		@Override
		public String toString() {
			return "Herrialde [izena=" + izena + ", hizkuntza=" + hizkuntza + "]";
		}
        
    }

}
