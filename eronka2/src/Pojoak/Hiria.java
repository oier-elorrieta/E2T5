package Pojoak;

public class Hiria {

	private int Id_hiria;
	private String izena;
	
		public Hiria(String izena, int Id_hiria) {
			this.izena = izena;
			this.Id_hiria = Id_hiria;
		}
		public String getIzena() {
			return izena;
		}
		public void setIzena(String izena) {
			this.izena = izena;
		}
		public int getId_hiria() {
			return Id_hiria;
		}
		public void setId_hiria(int Id_hiria) {
			this.Id_hiria = Id_hiria;
		}
		@Override
		public String toString() {
			return "Hiria [izena=" + izena + ", Id_hiria=" + Id_hiria + "]";
		}
	        
	   }

