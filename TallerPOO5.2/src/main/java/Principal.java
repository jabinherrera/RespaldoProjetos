public class Principal {
    public static void main(String[] args) {
        Avion a = new Avion();
        Persona p = new Persona("20489916-9", "jabin", 21);

        a.generarMatrizVacio();
        a.imprimirMatriz();
        a.reservarAsiento(3,4,p);
        a.imprimirMatriz();
        a.cantidadReservas();
        a.resetContadorReservas();
    }
}
