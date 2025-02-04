package ModeloDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JComboBox;


public class HerrialdeDao {
	private Connection conn;
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

	public void ComboHerrialde (JComboBox<String>comboBox) {
		   String query = "SELECT izena FROM herrialdeak";
		   try (Statement stmt = conn.createStatement();
		             ResultSet rs = stmt.executeQuery(query)) {

		            while (rs.next()) {
		                comboBox.addItem(rs.getString("izena"));
		            }
		        } catch (SQLException e) {
		            e.printStackTrace();
	}
	}
	}       

