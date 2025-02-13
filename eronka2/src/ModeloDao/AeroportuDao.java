package ModeloDao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Pojoak.Agentzia;
import Pojoak.Bidaia;

public class AeroportuDao {
    private Connection conn;

    // Constructor para establecer la conexión a la base de datos
    public AeroportuDao() {
    	   try {
	            String url = "jdbc:mysql://localhost:3306/db_e2t5ii";
	            String user = "root";
	            String password = "";
	            conn = DriverManager.getConnection(url, user, password);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
    

    // Método para obtener todas las agencias con sus respectivos viajes
    public ArrayList<Aeroportu> getAgenciesWithBida() {
        ArrayList<Agentzia> agencies = new ArrayList<>();
        String query = "SELECT * FROM agentzia";  // Consulta para obtener las agencias

        try (Statement statement = conn.createStatement();
             ResultSet rs = statement.executeQuery(query)) {

            while (rs.next()) {
                int idAgen = rs.getInt("idAgen");
                String izena = rs.getString("izena");
                String markaKolorea = rs.getString("markaKolorea");
                int langileKopurua = rs.getInt("langileKopurua");
                String mota = rs.getString("mota");
                String logo = rs.getString("logo");
                String pasahitza = rs.getString("pasahitza");

                // Obtener los viajes de la agencia
                List<Bidaia> bidaiaList = getBidaiaForAgency(idAgen);

                // Crear la agencia con los viajes
                Agentzia agentzia = new Agentzia(bidaiaList ,izena, markaKolorea, langileKopurua, mota, logo, pasahitza );
                agencies.add(agentzia);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return agencies;
    }

    // Método para obtener los viajes asociados con una agencia
    private List<Bidaia> getBidaiaForAgency(int idAgen) {
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
                
 
                Bidaia bidaia = new Bidaia( idBid, helmuga, hasieraData, amaieraData, egunak, mota, herrialdea);
                bidaiaList.add(bidaia);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bidaiaList;
    }
}
