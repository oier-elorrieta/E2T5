package ModeloDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;

import Pojoak.Agentzia;

public class AgentziaDao {
    private Connection conn;

    // Constructor para establecer la conexión
    public AgentziaDao() {
        try {
            String url = "jdbc:mysql://localhost:3307/db_e2t5";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

 // Método para obtener datos desde la base de datos
    public void ComboBoxBete(JComboBox<String> comboBox) {
        String query = "SELECT kodAMota FROM agenMota";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                comboBox.addItem(rs.getString("Mota"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}