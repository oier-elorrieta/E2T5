package ModeloDao;

import java.awt.TextField;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
public class BidaiaDao {


	

	
	    private Connection conn;

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

	 // Agentzia motak JComboBox batean sartzeko metodoa
	    public void ComboBoxBidaiMota(JComboBox<String> comboBox) {
	        String query = "SELECT kodBidMota, desk FROM bid_mota";
	        try (Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(query)) {

	            while (rs.next()) {
	                comboBox.addItem(rs.getString("KodBidMota"));
	                
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }	
	    public void TextFieldBidaiaMota(TextField textfield) {
	    	String query = "SELECT desk, desk FROM bid_mota";
	        try (Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(query)) {

	        	 if (rs.next()) {
	                 String dato = rs.getString("desk");
	                 textfield.setText(dato);  // Coloca el dato en el JTextField
	             }

	         } catch (SQLException e) {
	             e.printStackTrace();
	         } 
	      
	     }
	 }
   