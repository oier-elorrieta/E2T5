package ModeloDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JComboBox;

public class EkitaldiDao {

	private Connection conn;
	
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
	// Ekitaldi motak JComboBox batean sartzeko metodoa
	/**public void ComboBoxEkitaldiMota1(JComboBox<String>EkMotaBox) {
        String query = "SELECT  desk FROM bid_mota ";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
            	String datua = rs.getString ("desk");
                bidaiMotaBox.addItem(datua);
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }*/
	/**Jatorrizko Aireportua JComboBox batean sartzeko metodoa*/
	public void ComboBoxEkitaldiJaAer(JComboBox<String>JaAeroportuaBox) {
		String query = "SELECT hiria from aireportua ";
		try (Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query)){
			
			while (rs.next()) {
				String datua = rs.getString("hiria");
				JaAeroportuaBox.addItem(datua);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void ComboBoxEkitaldiHemAer(JComboBox<String>HemAeroportuaBox) {
		String query = "SELECT hiria from aireportua ";
		try (Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query)){
			
			while (rs.next()) {
				String datua = rs.getString("hiria");
				HemAeroportuaBox.addItem(datua);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
}
