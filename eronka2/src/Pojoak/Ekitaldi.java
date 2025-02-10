package Pojoak;

import java.sql.Date;
import java.sql.Time;
import java.text.DecimalFormat;

public class Ekitaldi {
	
	private int idZerb;
	private int idBid;
	private String mota;
	private String izena;
	private String desk;
	private String hiria;
	private double prezioa;
	private String deskribapena;
	private String hotelaIzena;
	private Date sarreraEguna;
	private Date irteeraEguna;
	private Date data;
	private String hegaldiKod;
	private Time irteeraOrdutegia;
	private String bidaiarenIraupena;
	private String kodAirelinea;
	private String idHerrialde;
	private Date itzuleraData;
	private String itzuleraOrdutegia;
	private String kodLogMota;
	private String kodAeroportu;
	private String kodAeroportuHelmuga;
	private int egunak;
	
	
	

	
	//ostatua
		public Ekitaldi(int idZerb, int idBid, String hotelaIzena, String hiria, double prezioa, Date sarreraEguna, Date irteeraEguna, String kodLogMota) {
			this.idZerb = idZerb;
			this.idBid = idBid;
			this.hotelaIzena = hotelaIzena;
			this.hiria = hiria;
			this.prezioa = prezioa;
			this.sarreraEguna = sarreraEguna;
			this.irteeraEguna = irteeraEguna;
			this.kodLogMota = kodLogMota;
		
}
		
		//hegaldia
		public Ekitaldi(int idZerb, int idBid, String hegaldiKod, double prezioa, Date irteeraEguna, Time irteeraOrdutegia, int egunak, String kodAirelinea, String kodAeroportu, String kodAeroportuHelmuga ) {
			this.idZerb = idZerb;
			this.idBid = idBid;
			this.hegaldiKod = hegaldiKod;
			this.prezioa = prezioa;
			this.irteeraEguna = irteeraEguna;
			this.irteeraOrdutegia = irteeraOrdutegia;
			this.egunak = egunak;
			this.kodAirelinea = kodAirelinea;
			this.kodAeroportu = kodAeroportu;
			this.kodAeroportuHelmuga= kodAeroportuHelmuga;
			
		}
		//beste batzuk 
		public Ekitaldi (int idZerb, int idBid, String izena, Date data, String desk, double prezioa) {
			this.idZerb = idZerb;
			this.idBid = idBid;
			this.izena = izena;
			this.data = data;
			this.desk = desk;
			this.prezioa = prezioa;
			
		}

		public int getIdZerb() {
			return idZerb;
		}

		public void setIdZerb(int idZerb) {
			this.idZerb = idZerb;
		}

		public int getIdBid() {
			return idBid;
		}

		public void setIdBid(int idBid) {
			this.idBid = idBid;
		}

		public String getMota() {
			return mota;
		}

		public void setMota(String mota) {
			this.mota = mota;
		}

		public String getIzena() {
			return izena;
		}

		public void setIzena(String izena) {
			this.izena = izena;
		}

		public String getDesk() {
			return desk;
		}

		public void setDesk(String desk) {
			this.desk = desk;
		}

		public String getHiria() {
			return hiria;
		}

		public void setHiria(String hiria) {
			this.hiria = hiria;
		}

		public double getPrezioa() {
			return prezioa;
		}

		public void setPrezioa(double prezioa) {
			this.prezioa = prezioa;
		}

		public String getDeskribapena() {
			return deskribapena;
		}

		public void setDeskribapena(String deskribapena) {
			this.deskribapena = deskribapena;
		}

		public String getHotelaIzena() {
			return hotelaIzena;
		}

		public void setHotelaIzena(String hotelaIzena) {
			this.hotelaIzena = hotelaIzena;
		}

		public Date getSarreraEguna() {
			return sarreraEguna;
		}

		public void setSarreraEguna(Date sarreraEguna) {
			this.sarreraEguna = sarreraEguna;
		}

		public Date getIrteeraEguna() {
			return irteeraEguna;
		}

		public void setIrteeraEguna(Date irteeraEguna) {
			this.irteeraEguna = irteeraEguna;
		}

		public Date getData() {
			return data;
		}

		public void setData(Date data) {
			this.data = data;
		}

		public String getHegaldiKod() {
			return hegaldiKod;
		}

		public void setHegaldiKod(String hegaldiKod) {
			this.hegaldiKod = hegaldiKod;
		}

		public Time getIrteeraOrdutegia() {
			return irteeraOrdutegia;
		}

		public void setIrteeraOrdutegia(Time irteeraOrdutegia) {
			this.irteeraOrdutegia = irteeraOrdutegia;
		}

		public String getBidaiarenIraupena() {
			return bidaiarenIraupena;
		}

		public void setBidaiarenIraupena(String bidaiarenIraupena) {
			this.bidaiarenIraupena = bidaiarenIraupena;
		}

		public String getKodAirelinea() {
			return kodAirelinea;
		}

		public void setKodAirelinea(String kodAirelinea) {
			this.kodAirelinea = kodAirelinea;
		}

		public String getIdHerrialde() {
			return idHerrialde;
		}

		public void setIdHerrialde(String idHerrialde) {
			this.idHerrialde = idHerrialde;
		}

		public Date getItzuleraData() {
			return itzuleraData;
		}

		public void setItzuleraData(Date itzuleraData) {
			this.itzuleraData = itzuleraData;
		}

		public String getItzuleraOrdutegia() {
			return itzuleraOrdutegia;
		}

		public void setItzuleraOrdutegia(String itzuleraOrdutegia) {
			this.itzuleraOrdutegia = itzuleraOrdutegia;
		}

		public String getKodLogMota() {
			return kodLogMota;
		}

		public void setKodLogMota(String kodLogMota) {
			this.kodLogMota = kodLogMota;
		}

		public String getKodAeroportu() {
			return kodAeroportu;
		}

		public void setKodAeroportu(String kodAeroportu) {
			this.kodAeroportu = kodAeroportu;
		}

		public String getKodAeroportuHelmuga() {
			return kodAeroportuHelmuga;
		}

		public void setKodAeroportuHelmuga(String kodAeroportuHelmuga) {
			this.kodAeroportuHelmuga = kodAeroportuHelmuga;
		}

		public int getEgunak() {
			return egunak;
		}

		public void setEgunak(int egunak) {
			this.egunak = egunak;
		}

		@Override
		public String toString() {
			return "Ekitaldi [idZerb=" + idZerb + ", idBid=" + idBid + ", mota=" + mota + ", izena=" + izena + ", desk="
					+ desk + ", hiria=" + hiria + ", prezioa=" + prezioa + ", deskribapena=" + deskribapena
					+ ", hotelaIzena=" + hotelaIzena + ", sarreraEguna=" + sarreraEguna + ", irteeraEguna="
					+ irteeraEguna + ", data=" + data + ", hegaldiKod=" + hegaldiKod + ", irteeraOrdutegia="
					+ irteeraOrdutegia + ", bidaiarenIraupena=" + bidaiarenIraupena + ", kodAirelinea=" + kodAirelinea
					+ ", idHerrialde=" + idHerrialde + ", itzuleraData=" + itzuleraData + ", itzuleraOrdutegia="
					+ itzuleraOrdutegia + ", kodLogMota=" + kodLogMota + ", kodAeroportu=" + kodAeroportu
					+ ", kodAeroportuHelmuga=" + kodAeroportuHelmuga + ", egunak=" + egunak + "]";
		}
		
}