package Pojoak;

import java.util.ArrayList;

public class Bidaia {
	        
	private int Id_bid;
	private String helmuga;
	private String hasieraData;
	private String amaieraData;
	private int egunak;
	private String mota;
	private String herrialdea;
	private ArrayList <Ekitaldi> arraEkit;
		public Bidaia(int id_bid, String helmuga, String hasieraData, String amaieraData, int egunak, String mota,
				String herrialdea, ArrayList<Ekitaldi> arraEkit) {
			Id_bid = id_bid;
			this.helmuga = helmuga;
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
		public String getHelmuga() {
			return helmuga;
		}
		public void setHelmuga(String helmuga) {
			this.helmuga = helmuga;
		}
		public String getHasieraData() {
			return hasieraData;
		}
		public void setHasieraData(String hasieraData) {
			this.hasieraData = hasieraData;
		}
		public String getAmaieraData() {
			return amaieraData;
		}
		public void setAmaieraData(String amaieraData) {
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
			return "Bidaia [Id_bid=" + Id_bid + ", helmuga=" + helmuga + ", hasieraData=" + hasieraData
					+ ", amaieraData=" + amaieraData + ", egunak=" + egunak + ", mota=" + mota + ", herrialdea="
					+ herrialdea + ", arraEkit=" + arraEkit + "]";
		}
	
		
		
}
			
			
	       
	 
	        
	       