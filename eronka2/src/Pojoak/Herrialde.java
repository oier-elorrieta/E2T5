package Pojoak;

public class Herrialde {

        
        private String Id_herrialde;
        private String izena;
		public Herrialde(String id_herrialde, String izena) {
			super();
			Id_herrialde = id_herrialde;
			this.izena = izena;
		}
		
		
		public String getId_herrialde() {
			return Id_herrialde;
		}


		public void setId_herrialde(String id_herrialde) {
			Id_herrialde = id_herrialde;
		}


		public String getIzena() {
			return izena;
		}


		public void setIzena(String izena) {
			this.izena = izena;
		}


		@Override
		public String toString() {
			return "Herrialde [Id_herrialde=" + Id_herrialde + ", izena=" + izena + "]";
		}
        
        
}