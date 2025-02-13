package ModeloDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JComboBox;


public class HerrialdeDao {
	private static Connection conn;
	 public HerrialdeDao() {
	        try {
	            String url = "jdbc:mysql://localhost:3307/db_e2t5ii";
	            String user = "root";
	            String password = "";
	            conn = DriverManager.getConnection(url, user, password);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	public static ArrayList<String> herrialdeak() {
		ArrayList<String> herrialdeak = new ArrayList<String>();
		String query = "SELECT izena FROM herrialdeak";
		try (Statement stmt = conn.createStatement();
		     ResultSet rs = stmt.executeQuery(query)) {

		            while (rs.next()) {
		                String datua = rs.getString("izena");
		                herrialdeak.add(datua);
		            }
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
			return herrialdeak;
		}
	}       

