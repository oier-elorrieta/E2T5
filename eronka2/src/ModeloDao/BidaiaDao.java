package ModeloDao;

import java.awt.TextField;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import Pojoak.Bidaia;
public class BidaiaDao {

	
	    private static Connection conn;

	    // Constructor para establecer la conexión
	    public BidaiaDao() {
	        try {
	            String url = "jdbc:mysql://localhost:3307/db_e2t5ii";
	            String user = "root";
	            String password = "";
	            conn = DriverManager.getConnection(url, user, password);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	 // Bidai motak JComboBox batean sartzeko metodoa
	    public static ArrayList<String> bidaiMotak() {
	    	ArrayList<String> bidaiMotak = new ArrayList<String>();
	        String query = "SELECT  desk FROM bid_mota ";
	        try (Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(query)) {

	            while (rs.next()) {
	            	String datua = rs.getString ("desk");
	            	bidaiMotak.add(datua);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return bidaiMotak;
	        
	    } 
	    public boolean insertBidaia(Bidaia bidaia, int idAgen) {

	    	

	        String query = "INSERT INTO Bidaia (izena, hasieraData, amaieraData, iraupena, kodBidMota, idHerri, idAgen) "

	                     + "VALUES (?, ?, ?, ?, ?, ?, ?)";



	        // Establecer conexión con la base de datos (asegúrate de que la conexión se pase o sea gestionada correctamente)

	        try (PreparedStatement stmt = conn.prepareStatement(query)) {



	            // Establecer los parámetros del PreparedStatement

	            stmt.setString(1, bidaia.getIzena());

	            stmt.setDate(2,  new java.sql.Date(bidaia.getHasieraData().getTime()));

	            stmt.setDate(3, new java.sql.Date(bidaia.getAmaieraData().getTime()));

	            stmt.setInt(4, bidaia.getEgunak());

	            stmt.setString(5, bidaia.getMota());

	            stmt.setString(6, bidaia.getHerrialdea());

	            stmt.setInt(7, idAgen);  // Asociar la Bidaia con el IdAgen del usuario que ha iniciado sesión



	            // Ejecutar la inserción

	            int rowsInserted = stmt.executeUpdate();

	            return rowsInserted > 0;



	        } catch (SQLException e) {

	            e.printStackTrace();

	            return false;

	        }

	    }

	   


	    }

	   
