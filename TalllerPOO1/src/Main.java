public class Main {
    public static void main(String[] args) {
        GestorArchivo ga = new GestorArchivo();
        Revista r0 = new Revista("1423", "Jabin", 1500, "RevistaUWU.txt", "Informatica");
        Libro l0 = new Libro("1222", "Jabin", 20000, "LibroUWU.txt", 18);
        Manual m0 = new Manual("1567", "Jabin", 2500, "ManualUWU.txt", "Computacion");
        Cliente c0 = new Cliente("Jabin", "20.489.916-9", "17/11/2000");
        Cliente c1 = new Cliente("Francisco", "9.704.661-1", "10/10/2000");
        Vendedor v0 = new Vendedor("Jabin", "20.489.916-9", "17/11/2000");

        //A varios métodos se le debe ingresar "ga" en el argumento para poder usar el Gestor de archivos
/*
        //Crea los directorios donde iran los archivos de texto
        ga.crearDirectorio("Producto//Revista");
        ga.crearDirectorio("Producto//Libro");
        ga.crearDirectorio("Producto//Manual");
        ga.crearDirectorio("Usuario//Cliente");
        ga.crearDirectorio("Usuario//Vendedor");

        Crea archivos de texto en los directorios correspondientes
        r0.crearRevista(ga);
        l0.crearLibro(ga);
        m0.crearManual(ga);
        c0.crearCliente(ga);
        v0.crearVendedor(ga);

        //Muestra el contenido de los archivos de texto como String
        r0.mostrarRevista(ga);
        l0.mostrarLibro(ga);
        m0.mostrarManual(ga);
        c0.mostrarCliente(ga);
        v0.mostrarVendedor(ga);

 */
        //c1.crearCliente(ga);
        //c0.descuentoAleatorio();
        c1.clienteAleatorio(ga);
    }
}

