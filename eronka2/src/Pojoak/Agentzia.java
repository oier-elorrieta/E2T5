package Pojoak;

import java.util.ArrayList;
import java.util.List;

public class Agentzia {
    
    private int idAgen;
    private String izena;
    private String markaKolorea;
    private String  langileKopurua;
    private String mota;
    private String logo;
    private String pasahitza;
    private List <Bidaia> arraBida;
    public Agentzia(int idAgen, String izena, String markaKolorea, String langileKopurua, String mota, String logo,
            String pasahitza, List<Bidaia> arraBida) {
    
        this.idAgen = idAgen;
        this.izena = izena;
        this.markaKolorea = markaKolorea;
        this.langileKopurua = langileKopurua;
        this.mota = mota;
        this.logo = logo;
        this.pasahitza = pasahitza;
        this.arraBida = arraBida;
    }
    public int getIdAgen() {
        return idAgen;
    }
    public void setIdAgen(int idAgen) {
        this.idAgen = idAgen;
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
    public String getPasahitza() {
        return pasahitza;
    }
    public void setPasahitza(String pasahitza) {
        this.pasahitza = pasahitza;
    }
    public List<Bidaia> getArraBida() {
        return arraBida;
    }
    public void setArraBida(List<Bidaia> arraBida) {
        this.arraBida = arraBida;
    }
    @Override
    public String toString() {
        return "Agentzia [idAgen=" + idAgen + ", izena=" + izena + ", markaKolorea=" + markaKolorea
                + ", langileKopurua=" + langileKopurua + ", mota=" + mota + ", logo=" + logo + ", pasahitza="
                + pasahitza + ", arraBida=" + arraBida + "]";
    }
}
	