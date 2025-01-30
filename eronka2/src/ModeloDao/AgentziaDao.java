package ModeloDao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

import javax.swing.ComboBoxModel;

import Pojoak.Agentzia;
import ModeloDao.AgentziaDao;
public class AgentziaDao {
	
	
	    private static final String URL = "jdbc:mysql://localhost:3307/db_e2t5";
	    private static final String USER = "root";
	    private static final String PASSWORD = "";

	    // Crear un nuevo departamento
	    public static ComboBoxModel agentziaMotaEskuratu() {
	        String query = "SELECT  kodMota FROM agenMota"; // Consulta SQL para obtener todos los departamentos
	        List<Agentzia> agentzia = new ArrayList<>();

	        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(query)) {

	            // Iterar sobre los resultados y agregar los departamentos a la lista
	            while (rs.next()) {
	                String kodMota = rs.getString("kodMota");
	                
	                Agentzia agentziak = new Agentzia(null, kodMota, kodMota, 0, kodMota, kodMota, kodMota);
	                agentzia.add(agentziak);
	            }
	            if (agentzia.isEmpty()) {
	                System.out.println("No se encontraron departamentos.");
	            } else {
	                for (Agentzia agentziak : agentzia) {
	                    System.out.println(agentzia); // Imprime cada departamento usando el método toString
	                }
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	       return new DefaultComboBoxModel (agentzia.toArray());
	    }     
	    }
	
	

