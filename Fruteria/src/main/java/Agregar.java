import java.sql.*;

public class Agregar {
    static final String DB_URL = "jdbc:mysql://localhost/fruteria";
    static final String USER = "User";
    static final String PASS = "123qwerty";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();
        ){
            System.out.println("Insertando datos en la tabla...");

            String sql = "INSERT INTO Clientes VALUES ('204899169', 'Jabin','Herrera', 21, 1, 958592674, 1);";
            stmt.executeUpdate(sql);
            System.out.println(sql);

            System.out.println("Datos insertados en la tabla...");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
