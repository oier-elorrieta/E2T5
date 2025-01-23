package erronka2;
public class SistemaPogo {

    
    public static class Agentzia {
       
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
    }

    public static class Bidaia {
        
        private String helmuga;
        private String data;

        
        public Bidaia(String helmuga, String data) {
            this.helmuga = helmuga;
            this.data = data;
        }

        
        public String getHelmuga() {
            return helmuga;
        }

        public void setHelmuga(String helmuga) {
            this.helmuga = helmuga;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }
    }

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
    }

    public static class Hiria {
        
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
    }

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
    }

    
    public static void main(String[] args) {
        
        Agentzia agentzia = new Agentzia("Turismo S.A.", "Abando kalea 12, Bilbao");
        Bidaia bidaia = new Bidaia("Bilbao", "2025-06-15");
        Ekitaldi ekitaldi = new Ekitaldi("Concierto en el Parque", "Un evento musical al aire libre.");
        Herrialde herrialde = new Herrialde("España", "Español");
        Hiria hiria = new Hiria("Bilbao", 348089);
        Aereportu aereportu = new Aereportu("Aeropuerto de Bilbao", "Bilbao");

        
        System.out.println("Agente: " + agentzia.getIzena() + ", Helbidea: " + agentzia.getHelbidea());
        System.out.println("Bidaia helmuga: " + bidaia.getHelmuga() + ", Data: " + bidaia.getData());
        System.out.println("Ekitaldi izena: " + ekitaldi.getIzena() + ", Deskribapena: " + ekitaldi.getDeskribapena());
        System.out.println("Herrialdea: " + herrialde.getIzena() + ", Hizkuntza: " + herrialde.getHizkuntza());
        System.out.println("Hiria: " + hiria.getIzena() + ", Biztanleria: " + hiria.getBiztanleria());
        System.out.println("Aereportu izena: " + aereportu.getIzena() + ", Kokapena: " + aereportu.getKokapena());
    }
}
