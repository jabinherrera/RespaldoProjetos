public class Main {
    public static void main(String[] args) {
        Libreria libreria = new Libreria();

        Libro l0 = new Libro("Titulo1", 2000, "Autor1", 001, 1, "tematica1", "genero1");
        Libro l1 = new Libro("Titulo2", 3500, "Autor2", 002, 1, "tematica2", "genero2");
        Revista r0 = new Revista("Titulo3", 1500, "Autor3", 003, 1, "tematica3");
        Revista r1 = new Revista("Titulo4", 1000, "Autor4", 004, 1, "tematica4");
        Documento d0 = new Documento("Titulo5", 5000, "Autor 5", 005, 1, "clasificacion1");

        libreria.agregarArticulo(l0);
        libreria.agregarArticulo(l1);
        libreria.agregarArticulo(r0);
        libreria.agregarArticulo(r1);
        libreria.agregarArticulo(d0);

        //Mis "emprezario" representan a personas que perteneces a organizaciones distintas
        Empresario e0 = new Empresario("Empresario1", "rut1", 100000, "clasificacionEmpresa1", 10, 20);
        Empresario e1 = new Empresario("Empresario2", "rut2", 400000, "clasificacionEmpresa2", 7, 12);

        libreria.agregarEmpresario(e0);
        libreria.agregarEmpresario(e1);

        //Metodos agregados en clase no conveniente por interfaz :c
        l0.arrendarArticulo(l0, e1);
        r1.arrendarArticulo(r1, e0);

        //En mi libreria solo las revistas no se pueden comprar, por lo demas soy se necesita que este disponible
        libreria.consultarDisponibles();

        l0.devolverPrestamo(l0, e1);
        r1.devolverPrestamo(r1, e0);

        e0.mostrarRegistroPrestamos();
        e1.mostrarRegistroPrestamos();

    }
}
