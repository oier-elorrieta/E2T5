package ModeloDao;

import Pojoak.Agentzia;
import Pojoak.Bidaia;
import Pojoak.Ekitaldi;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AgentziaDao {

    private static Connection conn;

    // Constructor para establecer la conexión a la base de datos
    public AgentziaDao() {
      try {
           String url = "jdbc:mysql://localhost:3307/db_e2t5ii";
           String user = "root";
           String password = "";
           conn = DriverManager.getConnection(url, user, password);
       } catch (SQLException e) {
           e.printStackTrace();
       }
   }
   

    // Método para obtener todas las agencias con sus respectivos viajes
    public ArrayList<Agentzia> AgentziaKargatuBidaiekin() {
        ArrayList<Agentzia> agencies = new ArrayList<>();
        String query = "SELECT * FROM agentzia";  // Consulta para obtener las agencias

        try (Statement statement = conn.createStatement();
             ResultSet rs = statement.executeQuery(query)) {

            while (rs.next()) {
                int idAgen = rs.getInt("idAgen");
                String izena = rs.getString("izena");
                String markaKolorea = rs.getString("markaren_kolorea");
                String langileKopurua = rs.getString("kodLangileKop");
                String mota = rs.getString("kodAMota");
                String logo = rs.getString("logoa");
                String pasahitza = rs.getString("pasahitza");

                // Obtener los viajes de la agencia
                ArrayList<Bidaia> bidaiaList = BidaiakKargatuEkitaldiekin(idAgen);

                // Crear la agencia con los viajes
                Agentzia a1 = new Agentzia(idAgen  ,izena, markaKolorea, langileKopurua, mota, logo, pasahitza,bidaiaList );
                agencies.add(a1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return agencies;
    }

    // Método para obtener los viajes asociados con una agencia
    public ArrayList<Bidaia> BidaiakKargatuEkitaldiekin(int idAgen) {
        ArrayList<Bidaia> bidaiaList = new ArrayList<>();
        String query = "SELECT * FROM bidaia WHERE idAgen = ? ";

        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, idAgen);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int idBid = rs.getInt("idBid");
                String izena = rs.getString("Izena");
                Date hasieraData = rs.getDate("hasieraData");
                Date amaieraData = rs.getDate("amaieraData");
                int egunak = rs.getInt("iraupena");
                String mota = rs.getString("kodBidMota");
                String herrialdea = rs.getString("idHerri");
                ArrayList<Ekitaldi> arraEkit = Ekitaldiak(idBid);

                // Crear el objeto Bidaia con su lista de Ekitaldi
                Bidaia b1 = new Bidaia(idBid, izena, hasieraData, amaieraData, egunak, mota, herrialdea, arraEkit);
                bidaiaList.add(b1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bidaiaList;
    }
 ArrayList<Ekitaldi> Ekitaldiak(int idBidi) {
        ArrayList<Ekitaldi> ArraEkit = new ArrayList<>();
        String query = "SELECT * FROM ostatua"+ " WHERE idBid = ?";

        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, idBidi);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int idZerb = rs.getInt("idZerb");
                int idBid = rs.getInt("idBid");
                String hotelaIzena = rs.getString("hotelaren_izena");
                String hiria = rs.getString("hiria");
                double prezioa = rs.getDouble("prezioa");
                Date sarreraEguna = rs.getDate("sarrera_eguna");
                Date irteeraEguna = rs.getDate("irteera_eguna");
                String kodLogMota = rs.getString("kodLogMota");
               
               
               

                Ekitaldi e1 = new Ekitaldi(idZerb, idBid, hotelaIzena, hiria, prezioa, sarreraEguna, irteeraEguna, kodLogMota );
                ArraEkit.add(e1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ArraEkit;
    }
  /**public ArrayList <Agentzia> loginOna (){
  ArrayList <Agentzia> agentziak = new ArrayList<>();
  String query = "SELECT izena, pasahitza FROM agentzia ";

       try (PreparedStatement ps = conn.prepareStatement(query)) {
           ResultSet rs = ps.executeQuery();

           while (rs.next()) {
          String erabiltzailea = rs.getString("izena");
          String pasahitza = rs.getString("pasahitza");
          //agentziak.add(erabiltzailea, pasahitza);
           }
           }catch (SQLException e) {
               e.printStackTrace();
           }
 
  return agentziak;
   }
  **/
 public ArrayList<String> loginOna() {
    ArrayList <String> agentziak = new ArrayList();
     String query = "SELECT * FROM agentzia WHERE izena = ? AND pasahitza = ?";
     try (PreparedStatement ps = conn.prepareStatement(query)) {
       
         ResultSet rs = ps.executeQuery();
         
         

       
         while (rs.next()) {
         agentziak.add(rs.getString("izena"));
              agentziak.add(rs.getString("pasahitza"));
       
         }
         rs.close();
         ps.close();
     } catch (SQLException e) {
         e.printStackTrace();
     }
     return agentziak;
 }
 public static ArrayList <String> langileKop() {
     ArrayList<String> langileKop = new ArrayList<String>();
     String query = "SELECT kodLangileKop FROM lang_kop"; ;
     try (Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {
         
             while (rs.next()) {
                 String datua = rs.getString("kodLangileKop");
                 langileKop.add(datua);
             }
         }catch (SQLException e) {
             e.printStackTrace();
                     
         }
     return langileKop;
 }    
 
 public static ArrayList <String> agenMota(){
     ArrayList<String> agenMota = new ArrayList<String>();
     String query = "SELECT kodAMota FROM agenMota";
     try (Statement stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery(query)) {
             
             while (rs.next()) {
                    String mota = rs.getString("kodAMota");
                   agenMota.add(mota);
                 }
             }catch (SQLException e) {
                 e.printStackTrace();
                         
             }
         return agenMota;
 }
 public boolean insertAgentzia(Agentzia agentzia) throws SQLException {
   // Definir las consultas SQL para insertar datos en ambas tablas
   String query = "INSERT INTO agentzia (izena, markaren_kolorea, kodLangileKop, kodAMota, logoa, pasahitza) VALUES (?, ?, ?, ?, ?, ?)";

   // Usar transacciones para asegurarse de que ambas inserciones sean atómicas
   try (PreparedStatement ps = conn.prepareStatement(query)) {
       // Desactivar autocommit para manejar transacciones manualmente
     

       // Insertar la agencia
       try (PreparedStatement stmtAgentzia = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
           stmtAgentzia.setString(1, agentzia.getIzena());
           stmtAgentzia.setString(2, agentzia.getMarkaKolorea());
           stmtAgentzia.setString(3, agentzia.getLangileKopurua());
           stmtAgentzia.setString(4, agentzia.getMota());
           stmtAgentzia.setString(5, agentzia.getLogo());
           stmtAgentzia.setString(6, agentzia.getPasahitza());

           int rowsAffected = stmtAgentzia.executeUpdate();

           // Verificar si la agencia se insertó correctamente
           if (rowsAffected > 0) {
               // Obtener el ID de la agencia recién insertada
               ResultSet generatedKeys = stmtAgentzia.getGeneratedKeys();
               if (generatedKeys.next()) {
                   int idAgen = generatedKeys.getInt(1);  // ID de la nueva agencia

                   // Insertar los viajes asociados
                   
                       // Ejecutar todas las inserciones de los viajes en un solo batch
                     
                   }

                   // Si todo es exitoso, hacer commit
                   
                   return true;  // Indicar que la inserción fue exitosa
               }
           }
       } catch (SQLException e) {
           conn.rollback();  // Si hay un error, revertir la transacción
           e.printStackTrace();
       }
 
   return false;  // Si algo falla, devolver false
 }
 // Método para insertar una nueva Bidaia en la base de datos
 public boolean insertBidaia(Bidaia bidaia, int idAgen) {

     String query = "INSERT INTO Bidaia (izena, hasieraData, amaieraData, egunak, mota, herrialdea, idAgen) "
                  + "VALUES (?, ?, ?, ?, ?, ?, ?)";

     // Establecer conexión con la base de datos (asegúrate de que la conexión se pase o sea gestionada correctamente)
     try (PreparedStatement stmt = conn.prepareStatement(query)) {

         // Establecer los parámetros del PreparedStatement
         stmt.setString(1, bidaia.getIzena());
         stmt.setDate(2, (Date) bidaia.getHasieraData());
         stmt.setDate(3, (Date) bidaia.getAmaieraData());
         stmt.setInt(4, bidaia.getEgunak());
         stmt.setString(5, bidaia.getMota());
         stmt.setString(6, bidaia.getHerrialdea());
         stmt.setInt(7, idAgen);  // Asociar la Bidaia con el IdAgen del usuario que ha iniciado sesión

         // Ejecutar la inserción
         int rowsInserted = stmt.executeUpdate();
         return rowsInserted > 0;

     } catch (SQLException e) {
         e.printStackTrace();
         return false;
     }
 }
}