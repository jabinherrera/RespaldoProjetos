public class Testeo {
    public static void main(String[] args) {

        Persona p0 = new Persona("Juan", 20);
        p0.leerArchivo("src/ListaPersona.txt");   //¿Por qué no funciona con la ruta relativa? R: era porque estaba en src el archivo

        String datos = p0.leerArchivo("src/ListaPersona.txt");
        String[] datosPersonas = datos.split("\n");
        Persona[] personas = new Persona[datosPersonas.length];
        for (int i = 0; i < datosPersonas.; i++) {
            personas[i] = new Persona(datosPersonas);
        }
    }
}
