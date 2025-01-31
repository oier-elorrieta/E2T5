package Pojoak;

import java.sql.Date;

public class Ekitaldi {
	
	private String izena;
	private String hiria;
	private double prezioa;
	private String deskribapena;
	private String hotelaIzena;
	private Date sarreraEguna;
	private Date irteeraEguna;
	private String hegaldiKod;
	private String irteeraOrdutegia;
	private String bidaiarenIraupena;
	private String kodAirelinea;
	private String idHerrialde;
	private Date itzuleraData;
	private String itzuleraOrdutegia;
	private String kodLogMota;
	private String kodAeroportu;
	
		public Ekitaldi(String izena, String hiria, double prezioa, String deskribapena, String hotelaIzena,
						Date sarreraEguna, Date irteeraEguna, String hegaldiKod, String irteeraOrdutegia,
						String bidaiarenIraupena, String kodAirelinea, String idHerrialde,
						Date itzuleraData, String itzuleraOrdutegia, String kodLogMota, String kodAeroportu) {
			this.izena = izena;
			this.hiria = hiria;
			this.prezioa = prezioa;
			this.deskribapena = deskribapena;
			this.hotelaIzena = hotelaIzena;
			this.sarreraEguna = sarreraEguna;
			this.irteeraEguna = irteeraEguna;
			this.hegaldiKod = hegaldiKod;
			this.irteeraOrdutegia = irteeraOrdutegia;
			this.bidaiarenIraupena = bidaiarenIraupena;
			this.kodAirelinea = kodAirelinea;
			this.idHerrialde = idHerrialde;
			this.itzuleraData = itzuleraData;
			this.itzuleraOrdutegia = itzuleraOrdutegia;
			this.kodLogMota = kodLogMota;
			this.kodAeroportu = kodAeroportu;
		}
		public String getIzena() {
			return izena;
		}
		public void setIzena(String izena) {
			this.izena = izena;
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
		public String getHegaldiKod() {
			return hegaldiKod;
		}
		public void setHegaldiKod(String hegaldiKod) {
			this.hegaldiKod = hegaldiKod;
		}
		public String getIrteeraOrdutegia() {
			return irteeraOrdutegia;
		}
		public void setIrteeraOrdutegia(String irteeraOrdutegia) {
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
		@Override
		public String toString() {
			return "Ekitaldi [izena=" + izena + ", hiria=" + hiria + ", prezioa=" + prezioa + ", deskribapena="
					+ deskribapena + ", hotelaIzena=" + hotelaIzena + ", sarreraEguna=" + sarreraEguna
					+ ", irteeraEguna=" + irteeraEguna + ", hegaldiKod=" + hegaldiKod + ", irteeraOrdutegia="
					+ irteeraOrdutegia + ", bidaiarenIraupena=" + bidaiarenIraupena  
					+ ", kodAirelinea=" + kodAirelinea + ", idHerrialde=" + idHerrialde
					+ ", itzuleraData=" + itzuleraData + ", itzuleraOrdutegia=" + itzuleraOrdutegia + "]";
		}
	        
	  }

