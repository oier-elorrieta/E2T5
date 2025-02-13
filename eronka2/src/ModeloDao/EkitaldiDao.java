package ModeloDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JComboBox;

import Pojoak.Ekitaldi;

public class EkitaldiDao {

	private static Connection conn;
	
	  // Constructor para establecer la conexión 
	public EkitaldiDao() {
        try {
            String url = "jdbc:mysql://localhost:3307/db_e2t5ii";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
public static ArrayList <String> EkitaldiJaAer(){
		ArrayList <String> EkitaldiJaAer = new ArrayList<String>();
		String query = "SELECT hiria from aireportua ";
		try (Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery(query)){
			
			while (rs.next()) {
				String datua = rs.getString("hiria");
				EkitaldiJaAer.add(datua);
			}		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return EkitaldiJaAer;
	}
	
	public static ArrayList <String> EkitaldiHemAer(){
		ArrayList <String> EkitaldiHemAer = new ArrayList<String>();
		String query = "SELECT hiria from aireportua ";
		try (Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery(query)){
			
			while (rs.next()) {
				String datua = rs.getString("hiria");
				EkitaldiHemAer.add(datua);
			}	
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return EkitaldiHemAer;
	}
	public void insertarEkitaldiHotela(Ekitaldi ekitaldi) throws SQLException {

        String sql = "INSERT INTO ekitaldi (idZerb, idBid, hotelaIzena, hiria, prezioa, sarreraEguna, irteeraEguna, kodLogMota) "

                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";



        try (PreparedStatement statement = conn.prepareStatement(sql)) {

            statement.setInt(1, ekitaldi.getIdZerb());

            statement.setInt(2, ekitaldi.getIdBid());

            statement.setString(3, ekitaldi.getHotelaIzena());

            statement.setString(4, ekitaldi.getHiria());

            statement.setDouble(5, ekitaldi.getPrezioa());

            statement.setDate(6, new java.sql.Date(ekitaldi.getSarreraEguna().getTime()));

            statement.setDate(7, new java.sql.Date(ekitaldi.getIrteeraEguna().getTime()));

            statement.setString(8, ekitaldi.getKodLogMota());

            statement.executeUpdate();

        }

    }



    // Método de inserción para el segundo constructor (hegaldi)

    public void insertarEkitaldiHegaldia(Ekitaldi ekitaldi) throws SQLException {

        String sql = "INSERT INTO ekitaldi (idZerb, idBid, hegaldiKod, prezioa, irteeraEguna, irteeraOrdutegia, egunak, "

                   + "kodAirelinea, kodAeroportu, kodAeroportuHelmuga) "

                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";



        try (PreparedStatement statement = conn.prepareStatement(sql)) {

            statement.setInt(1, ekitaldi.getIdZerb());

            statement.setInt(2, ekitaldi.getIdBid());

            statement.setString(3, ekitaldi.getHegaldiKod());

            statement.setDouble(4, ekitaldi.getPrezioa());

            statement.setDate(5, new java.sql.Date(ekitaldi.getIrteeraEguna().getTime()));

            statement.setTime(6, ekitaldi.getIrteeraOrdutegia());

            statement.setInt(7, ekitaldi.getEgunak());

            statement.setString(8, ekitaldi.getKodAirelinea());

            statement.setString(9, ekitaldi.getKodAeroportu());

            statement.setString(10, ekitaldi.getKodAeroportuHelmuga());

            statement.executeUpdate();

        }

    }



    // Método de inserción para el tercer constructor (beste batzuk)

    public void insertarEkitaldiBeste(Ekitaldi ekitaldi) throws SQLException {

        String sql = "INSERT INTO ekitaldi (idZerb, idBid, izena, data, desk, prezioa) "

                   + "VALUES (?, ?, ?, ?, ?, ?)";



        try (PreparedStatement statement = conn.prepareStatement(sql)) {

            statement.setInt(1, ekitaldi.getIdZerb());

            statement.setInt(2, ekitaldi.getIdBid());

            statement.setString(3, ekitaldi.getIzena());

            statement.setDate(4, new java.sql.Date(ekitaldi.getData().getTime()));

            statement.setString(5, ekitaldi.getDesk());

            statement.setDouble(6, ekitaldi.getPrezioa());

            statement.executeUpdate();

        }

    }

}



	
	