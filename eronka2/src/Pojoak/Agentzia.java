package Pojoak;

public class Agentzia {
	
	       
        private String izena;
        private String markaKolorea;
        private String langileKopurua;
        private String mota;
        private String logo;
        
        
		
		public Agentzia(String izena, String markaKolorea, String langileKopurua, String mota, String logo) {
			super();
			this.izena = izena;
			this.markaKolorea = markaKolorea;
			this.langileKopurua = langileKopurua;
			this.mota = mota;
			this.logo = logo;
		}
		public void setIzena(String izena) {
			this.izena = izena;
		}
		public String getMarkaKolorea() {
			return markaKolorea;
		}
		public void setMarkaKolorea(String markaKolorea) {
			this.markaKolorea = markaKolorea;
		}
		public String getLangileKopurua() {
			return langileKopurua;
		}
		public void setLangileKopurua(String langileKopurua) {
			this.langileKopurua = langileKopurua;
		}
		public String getMota() {
			return mota;
		}
		public void setMota(String mota) {
			this.mota = mota;
		}
		public String getLogo() {
			return logo;
		}
		public void setLogo(String logo) {
			this.logo = logo;
		}
		@Override
		public String toString() {
			return "Agentzia [izena=" + izena + ", markaKolorea=" + markaKolorea + ", langileKopurua=" + langileKopurua
					+ ", mota=" + mota + ", logo=" + logo + "]";
		}
<<<<<<< HEAD:eronka2/src/Pojoak/AgentziaPOJO.java
	}
=======
        
    
>>>>>>> 69bad08c4c57aa43dbd32474a31c7a9696cfd9e4:eronka2/src/Pojoak/Agentzia.java
}
        
     