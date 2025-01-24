package Pojoak;

public class Agentzia {
	
	       
        private String izena;
        private String helbidea;

        
        public Agentzia(String izena, String helbidea) {
            this.izena = izena;
            this.helbidea = helbidea;
        }

        
        public String getIzena() {
            return izena;
        }

        public void setIzena(String izena) {
            this.izena = izena;
        }

        public String getHelbidea() {
            return helbidea;
        }

        public void setHelbidea(String helbidea) {
            this.helbidea = helbidea;
        }


		@Override
		public String toString() {
			return "Agentzia [izena=" + izena + ", helbidea=" + helbidea + "]";
		}
        
    
}
