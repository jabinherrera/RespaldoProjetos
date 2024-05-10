import java.sql.*;

public class Consultar {
    static final String DB_URL = "jdbc:mysql://localhost/fruteria";
    static final String USER = "User";
    static final String PASS = "123qwerty";
    static String QUERY = "SELECT * FROM Clientes";

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);
            while (rs.next()){
                System.out.println("RUT: " + rs.getString("rut"));
                System.out.println("Nombre: " + rs.getString("nombre"));
                System.out.println("Edad: " + rs.getInt("edad"));
                System.out.println("Sexo: " + rs.getInt("sexo"));
                System.out.println("Telefono: " + rs.getString("telefono"));
                System.out.println("Frecuente: " + rs.getInt("cFrecuente"));
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
}
