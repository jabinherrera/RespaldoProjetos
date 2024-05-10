public class Main {
    public static void main(String[] args) {

        Mapa m0 =  new Mapa();

        m0.generarMapa();
        m0.insertarIslaRandom(5);
        m0.imprimirMapa();
        System.out.println("\n");
        m0.resaltarIslas();
        m0.coordenadasIslas();
    }
}

//Faltan validadores en los métodos
