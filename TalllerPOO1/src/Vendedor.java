public class Vendedor extends Usuario{
    private String fechaContrato;

    public Vendedor(String nombre, String rut, String fechaContrato) {
        super(nombre, rut);
        this.fechaContrato = fechaContrato;
    }

    public String getFechaContrato() {
        return fechaContrato;
    }

    //Permite crear un archivo de texto de un vendedor
    public void crearVendedor(GestorArchivo ga){
        if (validarRut(this.getRut())) {
            ga.crearArchivo("Usuario//Vendedor//" + this.getRut(),
                    "Nombre: " + this.getNombre() + "\n" +
                            "Rut: " + this.getRut() + "\n" +
                            "Fecha de contrato: " + this.getFechaContrato());
        }else{
            System.out.println("El vendedor no pudo ser registrado");
        }
    }

    //Muestra el contenido de un archivo de texto de un vendedor
    public void mostrarVendedor(GestorArchivo ga){
        System.out.println(ga.leerArchivo("Usuario//Vendedor//" + this.getRut()));
    }
}
