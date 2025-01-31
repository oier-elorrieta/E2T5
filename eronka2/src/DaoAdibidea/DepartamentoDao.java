package DaoAdibidea;

	import java.sql.*;
	import java.util.ArrayList;
	import java.util.List;
	import POJO.Departamentuak;
	import Modelodao.DepartamentoDao;
	public class DepartamentoDao {
	    private static final String URL = "jdbc:mysql://localhost:3306/enpresa";
	    private static final String USER = "root";
	    private static final String PASSWORD = "";

	    // Crear un nuevo departamento
	    public ArrayList<Departamentuak> eskuratuDepartamentuak() {
	        String query = "SELECT * FROM departamentos"; // Consulta SQL para obtener todos los departamentos
	        List<Departamentuak> departamentuak = new ArrayList<>();

	        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(query)) {

	            // Iterar sobre los resultados y agregar los departamentos a la lista
	            while (rs.next()) {
	                int dept_no = rs.getInt("dept_no");
	                String dnombre = rs.getString("dnombre");
	                String loc = rs.getString("loc");

	                Departamentuak departamento = new Departamentuak(dept_no, dnombre, loc);
	                departamentuak.add(departamento);
	            }
	            if (departamentuak.isEmpty()) {
	                System.out.println("No se encontraron departamentos.");
	            } else {
	                for (Departamentuak departamento : departamentuak) {
	                    System.out.println(departamento); // Imprime cada departamento usando el método toString
	                }
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	       return (ArrayList<Departamentuak>) departamentuak;
	    }
	        
	    }
	
	