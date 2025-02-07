package ModeloDao;

import Pojoak.Agentzia;
import Pojoak.Bidaia;
import Pojoak.Ekitaldi;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AgentziaDao {

    private static Connection conn;

    // Constructor para establecer la conexión a la base de datos
    public AgentziaDao() {
           try {
                String url = "jdbc:mysql://localhost:3307/db_e2t5ii";
                String user = "root";
                String password = "";
                conn = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    

    public static ArrayList<String> agentziaMotak() {
    	ArrayList<String> agentziaMotak = new ArrayList<String>();
    	String query = "SELECT kodAMota FROM agenmota";
    	try (Statement stmt = conn.createStatement();
    		ResultSet rs = stmt.executeQuery(query)) {
    		
    			while (rs.next()) {
    				String mota = rs.getString("kodAMota");
    				agentziaMotak.add(mota);
    			}
    		}catch (SQLException e) {
    			e.printStackTrace();
    		}
    	return agentziaMotak;
    }
    
    
    
    // Método para obtener todas las agencias con sus respectivos viajes
    public ArrayList<Agentzia> getAgenciesWithBidaia() {
        ArrayList<Agentzia> agencies = new ArrayList<>();
        String query = "SELECT * FROM agentzia";  // Consulta para obtener las agencias

        try (Statement statement = conn.createStatement();
             ResultSet rs = statement.executeQuery(query)) {

            while (rs.next()) {
                int idAgen = rs.getInt("idAgen");
                String izena = rs.getString("izena");
                String markaKolorea = rs.getString("markaren_kolorea");
                String langileKopurua = rs.getString("kodLangileKop");
                String mota = rs.getString("kodAMota");
                String logo = rs.getString("logoa");
                String pasahitza = rs.getString("pasahitza");

                // Obtener los viajes de la agencia
                List<Bidaia> bidaiaList = getBidaiaForAgency(idAgen);

                // Crear la agencia con los viajes
                Agentzia agentzia = new Agentzia(idAgen  ,izena, markaKolorea, langileKopurua, mota, logo, pasahitza,bidaiaList );
                agencies.add(agentzia);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return agencies;
    }

    // Método para obtener los viajes asociados con una agencia
    public List<Bidaia> getBidaiaForAgency(int idAgen) {
        List<Bidaia> bidaiaList = new ArrayList<>();
        String query = "SELECT * FROM bidaia WHERE idAgen = ?";

        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, idAgen);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int idBid = rs.getInt("idBid");
                String helmuga = rs.getString("helmuga");
                Date hasieraData = rs.getDate("hasieraData");
                Date amaieraData = rs.getDate("amaieraData");
                int egunak = rs.getInt("egunak");
                String mota = rs.getString("mota");
                String herrialdea = rs.getString("herrialdea");
                ArrayList<Ekitaldi> arraEkit = getEkitaldiForBidaia(idBid);

                // Crear el objeto Bidaia con su lista de Ekitaldi
                Bidaia bidaia = new Bidaia(idBid, helmuga, hasieraData, amaieraData, egunak, mota, herrialdea, arraEkit);
                bidaiaList.add(bidaia);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bidaiaList;
    }
    private ArrayList<Ekitaldi> getEkitaldiForBidaia(int idBid) {
        ArrayList<Ekitaldi> ArraEkit = new ArrayList<>();
        String query = "SELECT * FROM ekitaldi WHERE idBid = ?";

        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, idBid);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int idEkit = rs.getInt("idEkit");
                String izena = rs.getString("izena");
                Date data = rs.getDate("data");

                Ekitaldi ekitaldi = new Ekitaldi(izena, izena, idEkit, izena, izena, data, data, izena, izena, izena, izena, izena, data, izena, izena, izena);
                ArraEkit.add(ekitaldi);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ArraEkit;
    }
    public static ArrayList <String> langileKop() {
    	ArrayList<String> langileKop = new ArrayList<String>();
    	String query = "SELECT kodLangileKop FROM agentzia";
    	try (Statement stmt = conn.createStatement();
    		ResultSet rs = stmt.executeQuery(query)) {
    		
    			while (rs.next()) {
    				String datua = rs.getString("kodLangileKop");
    				langileKop.add(datua);
    			}
    		}catch (SQLException e) {
    			e.printStackTrace();
    					
    		}
    	return langileKop;
    }	
  }


    