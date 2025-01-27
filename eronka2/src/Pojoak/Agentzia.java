package Pojoak;

public class Agentzia {
	
	       
        
		private String izena;
        private String markaKolorea;
        private String langileKopurua;
        private String mota;
        private String logo;
        private String pasahitza;
        
        
		
		public Agentzia(String izena, String markaKolorea, String langileKopurua, String mota, String logo, String pasahitza) {
			
			this.izena = izena;
			this.markaKolorea = markaKolorea;
			this.langileKopurua = langileKopurua;
			this.mota = mota;
			this.logo = logo;
			this.pasahitza = pasahitza;
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
		public String getPasahitza () {
			return pasahitza;
		}
		public void setPasahitza(String pasahitza) {
			this.pasahitza = pasahitza;
		}
		@Override
		public String toString() {
			return "Agentzia [izena=" + izena + ", markaKolorea=" + markaKolorea + ", langileKopurua=" + langileKopurua
					+ ", mota=" + mota + ", logo=" + logo + ", pasahitza =" + pasahitza + "]";
		}

	}

        
    


        
     
