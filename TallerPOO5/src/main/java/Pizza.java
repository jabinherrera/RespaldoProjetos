public class Pizza extends Producto{
    private String tipo;
    private String tamaño;

    public Pizza(int codigo, String nombre, int precio, String tipo, String tamaño) {
        super(codigo, nombre, precio);
        this.tipo = tipo;
        this.tamaño = tamaño;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void asignarTipo(int opcion){
        switch (opcion){
            case 1:
                setTamaño("Personal");
            case 2:
                setTamaño("Mediana");
            case 3:
                setTamaño("Grande");
            case 4:
                setTamaño("Extra Grande");
        }
    }

    public void asignarTamaño(int opcion){
        switch (opcion){
            case 1:
                setTamaño("Personal");
            case 2:
                setTamaño("Mediana");
            case 3:
                setTamaño("Grande");
            case 4:
                setTamaño("Extra Grande");
        }
    }
}
