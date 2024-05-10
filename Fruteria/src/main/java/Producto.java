import java.sql.*;

public class Producto {
    int id;
    String nombre;
    int precio;
    int stock;

    static final String DB_URL = "jdbc:mysql://localhost/fruteria";
    static final String USER = "User";
    static final String PASS = "123qwerty";
    static String QUERY = "SELECT * FROM Productos";

    public void agregarProducto() {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();
        ) {
            System.out.println("Insertando datos en la tabla...");

            String sql = "INSERT INTO Productos VALUES ();";
            stmt.executeUpdate(sql);
            System.out.println(sql);

            System.out.println("Datos insertados en la tabla...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void consultarProducto(){try {
        Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(QUERY);
        while (rs.next()){
            System.out.println("ID: " + rs.getInt("id"));
            System.out.println("Nombre: " + rs.getString("nombre"));
            System.out.println("Precio: " + rs.getInt("precio"));
            System.out.println("Stock: " + rs.getInt("stock"));

        }
    }catch (SQLException e){
        System.out.println(e);
    }}
}
