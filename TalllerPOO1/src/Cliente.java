public class Cliente extends Usuario {
    private String cumple;

    public Cliente(String nombre, String rut, String cumple) {
        super(nombre, rut);
        this.cumple = cumple;
    }

    public String getCumple() {
        return cumple;
    }

    //Permite crear un archivo de texto de cliente
    public void crearCliente(GestorArchivo ga){
        if (validarRut(this.getRut())) {
            ga.crearArchivo("Usuario//Cliente//" + this.getRut(),
                    "Nombre: " + this.getNombre() + "\n" +
                            "Rut: " + this.getRut() + "\n" +
                            "Fecha de cumpleaños: " + this.getCumple());
        }else{
            System.out.println("El Cliente no pudo ser registrado");
        }
    }

    //Muestra el contenido de un archivo de texto de un cliente
    public void mostrarCliente(GestorArchivo ga){
        System.out.println(ga.leerArchivo("Usuario//Cliente//" + this.getRut()));
    }

    //Genera un número aleatorio entre el 10 y el 50 y le agrega un "%"
    public static int descuentoAleatorio(){
        var aux = (int)(Math.random()*40)+10;
        System.out.println("El descuento es de: " + aux + "%");
        return aux;
    }

    //Selecciona un cliente aleatorio para asignarle un descuente aleatorio generado previamente
    public void clienteAleatorio(GestorArchivo ga){
        descuentoAleatorio();
        var aux = ga.listaArchivos("Usuario//Cliente//");
        System.out.println("Para el cliente" + aux);
        //Hasta aquí logré llegar
    }
}

