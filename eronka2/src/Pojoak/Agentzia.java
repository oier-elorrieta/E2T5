package Pojoak;

import java.util.ArrayList;

public class Agentzia {
	
	private String izena;
	private String markaKolorea;
	private int  langileKopurua;
	private String mota;
	private String logo;
	private String pasahitza;
	private ArrayList <Bidaia> arraBida;
	public Agentzia(ArrayList<Bidaia> arraBida, String izena, String markaKolorea, int langileKopurua, String mota,
			String logo, String pasahitza) {
		this.arraBida = arraBida;
		this.izena = izena;
		this.markaKolorea = markaKolorea;
		this.langileKopurua = langileKopurua;
		this.mota = mota;
		this.logo = logo;
		this.pasahitza = pasahitza;
	}
	public ArrayList<Bidaia> getArraBida() {
		return arraBida;
	}
	public void setArraBida(ArrayList<Bidaia> arraBida) {
		this.arraBida = arraBida;
	}
	public String getIzena() {
		return izena;
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
	public int getLangileKopurua() {
		return langileKopurua;
	}
	public void setLangileKopurua(int langileKopurua) {
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
	public String getPasahitza() {
		return pasahitza;
	}
	public void setPasahitza(String pasahitza) {
		this.pasahitza = pasahitza;
	}
	@Override
	public String toString() {
		return "Agentzia [arraBida=" + arraBida + ", izena=" + izena + ", markaKolorea=" + markaKolorea
				+ ", langileKopurua=" + langileKopurua + ", mota=" + mota + ", logo=" + logo + ", pasahitza="
				+ pasahitza + "]";
	}
        
		
	}

	

        
    


        
     
	