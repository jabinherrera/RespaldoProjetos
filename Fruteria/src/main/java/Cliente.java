import java.sql.*;

public class Cliente {
    String rut;
    String nombre;
    int edad;
    int sexo;
    String telefono;
    int cFrecuente;

    static final String DB_URL = "jdbc:mysql://localhost/testdb";
    static final String USER = "testUser";
    static final String PASS = "12345678qwerty";
    static String QUERY = "SELECT * FROM Clientes";
    private SQLException e;

    public Cliente(String rut, String nombre, int edad, int sexo, String telefono, int cFrecuente) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.telefono = telefono;
        this.cFrecuente = cFrecuente;
    }

    public Cliente() {
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getcFrecuente() {
        return cFrecuente;
    }

    public void setcFrecuente(int cFrecuente) {
        this.cFrecuente = cFrecuente;
    }


        public void agregarCliente(String rut, String nombre, int edad, int sexo, String telefono, int cFrecuente) {
            try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                 Statement stmt = conn.createStatement();
            ) {
                System.out.println("Insertando datos en la tabla...");

                String sql = "INSERT INTO Clientes VALUES ('204899169', 'Jabin','Herrera', 21, 1, '958592674', 1);";
                stmt.executeUpdate(sql);
                System.out.println(sql);

                System.out.println("Datos insertados en la tabla...");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    public static void subirBase(String datos, String tabla) {
        String sql = "INSERT INTO " + tabla +" VALUES (" + datos+ " );";

        System.out.println(sql);
    }

    public static void consultarCliente(){try {
        Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(QUERY);
        while (rs.next()){
            System.out.println("RUT: " + rs.getString("id"));
            System.out.println("Edad: " + rs.getInt("edad"));
            System.out.println("Nombre: " + rs.getString("nombre"));

        }
    }catch (SQLException e){
        System.out.println(e);
        }
    }

    public void eliminarCliente(){}

    @Override
    public String toString() {
        return  "'" + rut +
                "', '" + nombre +
                "', " + edad +
                ", " + sexo +
                ", " + telefono +
                ", " + cFrecuente;
    }

}
