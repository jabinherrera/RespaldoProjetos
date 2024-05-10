import java.sql.*;

public class TestApp2 {
    static final String DB_URL = "jdbc:mysql://localhost/testDB";
    static final String USER = "testUser";
    static final String PASS = "12345678qwerty";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();
        ) {
            System.out.println("Inserting records into the table...");
            String sql = "INSERT INTO Personas VALUES (2,31,'Claudia');";
            stmt.executeUpdate(sql);
            System.out.println(sql);

            sql = "INSERT INTO Personas VALUES (2,31,'Manuel')";
            stmt.executeUpdate(sql);
            System.out.println(sql);

            sql = "INSERT INTO Personas VALUES (2,31,'Julio')";
            stmt.executeUpdate(sql);
            System.out.println(sql);

            sql = "INSERT INTO Personas VALUES (2,31,'Carmen')";
            stmt.executeUpdate(sql);
            System.out.println(sql);

            System.out.println("Inserted records into the table...");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
