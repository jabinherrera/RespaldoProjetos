public class Bebida extends Producto{
    private String tamaño;


    public Bebida(int codigo, String nombre, int precio, String tamaño) {
        super(codigo, nombre, precio);
        this.tamaño = tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void asignarTamaño(int opcion){
        switch (opcion){
            case 1:
                setTamaño("1 Litro");
            case 2:
                setTamaño("1.5 Litro");
            case 3:
                setTamaño("2.5 Litros");
            case 4:
                setTamaño("3 Litros");
        }
    }
}
