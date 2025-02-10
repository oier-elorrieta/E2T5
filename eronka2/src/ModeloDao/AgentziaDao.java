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
    

    // Método para obtener todas las agencias con sus respectivos viajes
    public ArrayList<Agentzia> AgentziaKargatuBidaiekin() {
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
                ArrayList<Bidaia> bidaiaList = BidaiakKargatuEkitaldiekin(idAgen);

                // Crear la agencia con los viajes
                Agentzia a1 = new Agentzia(idAgen  ,izena, markaKolorea, langileKopurua, mota, logo, pasahitza,bidaiaList );
                agencies.add(a1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return agencies;
    }

    // Método para obtener los viajes asociados con una agencia
    public ArrayList<Bidaia> BidaiakKargatuEkitaldiekin(int idAgen) {
        ArrayList<Bidaia> bidaiaList = new ArrayList<>();
        String query = "SELECT * FROM bidaia WHERE idAgen = ? ";

        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, idAgen);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int idBid = rs.getInt("idBid");
                String izena = rs.getString("Izena");
                Date hasieraData = rs.getDate("hasieraData");
                Date amaieraData = rs.getDate("amaieraData");
                int egunak = rs.getInt("iraupena");
                String mota = rs.getString("kodBidMota");
                String herrialdea = rs.getString("idHerri");
                ArrayList<Ekitaldi> arraEkit = Ekitaldiak(idBid);

                // Crear el objeto Bidaia con su lista de Ekitaldi
                Bidaia b1 = new Bidaia(idBid, izena, hasieraData, amaieraData, egunak, mota, herrialdea, arraEkit);
                bidaiaList.add(b1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bidaiaList;
    }
 ArrayList<Ekitaldi> Ekitaldiak(int idBid) {
        ArrayList<Ekitaldi> ArraEkit = new ArrayList<>();
        String query = "SELECT * FROM zerbitzuak WHERE idBid = ?";

        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, idBid);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int idEkit = rs.getInt("idZerb");
                int idBidi = rs.getInt("idBid");
                String izena = rs.getString("izena");
                double prezioa = rs.getDouble("prezioa");
                String mota = rs.getString("mota");
                
                
                

                Ekitaldi e1 = new Ekitaldi(idEkit, idBidi, izena, mota, prezioa );
                ArraEkit.add(e1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ArraEkit;
    }
  /**public ArrayList <Agentzia> loginOna (){
	   ArrayList <Agentzia> agentziak = new ArrayList<>();
	   String query = "SELECT izena, pasahitza FROM agentzia ";

       try (PreparedStatement ps = conn.prepareStatement(query)) {
           ResultSet rs = ps.executeQuery();

           while (rs.next()) {
        	   String erabiltzailea = rs.getString("izena");
        	   String pasahitza = rs.getString("pasahitza");
        	   //agentziak.add(erabiltzailea, pasahitza);
           }
           }catch (SQLException e) {
               e.printStackTrace();
           }
	   
	   return agentziak;
   }
  **/
 public ArrayList<String> loginOna() {
    ArrayList <String> agentziak = new ArrayList();
     String query = "SELECT * FROM agentzia WHERE izena = ? AND pasahitza = ?";
     try (PreparedStatement ps = conn.prepareStatement(query)) {
       
         ResultSet rs = ps.executeQuery();
         
         

        
         while (rs.next()) {
        	  agentziak.add(rs.getString("izena")); 
              agentziak.add(rs.getString("pasahitza"));
      	   
         }
         rs.close();
         ps.close();
     } catch (SQLException e) {
         e.printStackTrace();
     }
     return agentziak;
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


