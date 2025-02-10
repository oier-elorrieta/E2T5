package Pojoak;

import java.sql.Date;
import java.util.ArrayList;

public class Bidaia {
	        
	private int Id_bid;
	private String izena;
	private Date hasieraData;
	private Date amaieraData;
	private int egunak;
	private String mota;
	private String herrialdea;
	private ArrayList <Ekitaldi> arraEkit;
		public Bidaia(int id_bid, String izena, Date hasieraData, Date amaieraData, int egunak, String mota,
				String herrialdea, ArrayList <Ekitaldi> arraEkit) {
			Id_bid = id_bid;
			this.izena = izena;
			this.hasieraData = hasieraData;
			this.amaieraData = amaieraData;
			this.egunak = egunak;
			this.mota = mota;
			this.herrialdea = herrialdea;
			this.arraEkit = arraEkit;
		}
		public int getId_bid() {
			return Id_bid;
		}
		public void setId_bid(int id_bid) {
			Id_bid = id_bid;
		}
		public String getIzena() {
			return izena;
		}
		public void setIzena(String izena) {
			this.izena = izena;
		}
		public Date getHasieraData() {
			return hasieraData;
		}
		public void setHasieraData(Date hasieraData) {
			this.hasieraData = hasieraData;
		}
		public Date getAmaieraData() {
			return amaieraData;
		}
		public void setAmaieraData(Date amaieraData) {
			this.amaieraData = amaieraData;
		}
		public int getEgunak() {
			return egunak;
		}
		public void setEgunak(int egunak) {
			this.egunak = egunak;
		}
		public String getMota() {
			return mota;
		}
		public void setMota(String mota) {
			this.mota = mota;
		}
		public String getHerrialdea() {
			return herrialdea;
		}
		public void setHerrialdea(String herrialdea) {
			this.herrialdea = herrialdea;
		}
		public ArrayList<Ekitaldi> getArraEkit() {
			return arraEkit;
		}
		public void setArraEkit(ArrayList<Ekitaldi> arraEkit) {
			this.arraEkit = arraEkit;
		}
		@Override
		public String toString() {
			return "Bidaia [Id_bid=" + Id_bid + ", izena=" + izena + ", hasieraData=" + hasieraData
					+ ", amaieraData=" + amaieraData + ", egunak=" + egunak + ", mota=" + mota + ", herrialdea="
					+ herrialdea + ", arraEkit=" + arraEkit + "]";
		}
	
		
		
}
			
			
	       
	 
	        
	       