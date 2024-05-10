import java.sql.*;

public class TestApp {
    static final String DB_URL = "jdbc:mysql://localhost/testDB";
    static final String USER = "testUser";
    static final String PASS = "12345678qwerty";
    static String QUERY = "SELECT * FROM Personas";

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);
            while (rs.next()){
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Edad: " + rs.getInt("edad"));
                System.out.println("Nombre: " + rs.getString("nombre"));
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
}
