public class Main {
    public static void main(String[] args) {
        Revista r0 = new Revista("revista-r0",1000,"autor-r0","codigo-r0","tematica-r0");
        Libro l0 = new Libro("nombre-l0",2500,"autor-l0","codigo-l0","tematica-l0","genero-l0");
        Documento d0 = new Documento("nombre",3000,"autor","codigo","clasificacionA");
        Organizacion o0 = new Organizacion("organizacion-o0","rut-o0","empresa-o0", 10,5);
        Persona p0 = new Persona("Jabin","20.489.916-9");

        r0.añadirRevista("001","revista1");
        r0.añadirRevista("002","revista2");
        l0.añadirLibro("001","libro1");
        l0.añadirLibro("002","libro2");
        d0.añadirDocumento("001","documento1");
        o0.añadirOrganizacion("rut1","organizacion1");
        o0.añadirOrganizacion("rut2","organizacion2");

        System.out.println(r0.arrRevista);     //Ver stock
        System.out.println(l0.arrLibro);
        System.out.println(d0.arrDocumento);
        System.out.println(o0.arrOrganizacion);

        p0.definirArticulo();                   //A traves de este metodo se puede arrendar o comprar




    }
}
