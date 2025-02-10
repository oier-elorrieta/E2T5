package ModeloDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JComboBox;

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
}
	
	