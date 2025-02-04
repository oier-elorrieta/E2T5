package Konexioa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Konexioa {
	
	
	    public static void main(String[] args) {
	        // URL de la base de datos, usuario y contraseña
	        String url = "jdbc:mysql://localhost:3307/db_e2t5ii";
	        String usuario = "root";
	        String contraseña = "";

	        // Conexion JDBC
	        try (Connection konexioa = DriverManager.getConnection(url, usuario, contraseña)) {
	            System.out.println("Conexión exitosa a la base de datos");

	            // Crear un Statement para ejecutar consultas
	            Statement stm = konexioa.createStatement();
	            // Ejemplo de consulta (opcional)
	            String sql = "SELECT * ";
	            // ResultSet rs = stmt.executeQuery(sql; // Ejecutar consulta

	        } catch (SQLException e) {
	            System.out.println("Error al conectar con la base de datos");
	            e.printStackTrace();
	        }
	    }
	}

