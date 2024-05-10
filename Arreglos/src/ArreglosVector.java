import java.util.Vector;

public class ArreglosVector {
    public static void main(String[] args) {
        Vector<String> arr = new Vector<>();
        //Vector<tipo> nombre = new Vector<>(Capacidad inicial);        //se puede modificar la capacidad inicial
        arr.add("Rojo");                                                //principalmente usado para optimizar espacio
        arr.add("Verde");
        arr.add("Azul");
        arr.add("Morado");
        arr.add("Naranja");
        arr.add("Cafe");

        System.out.println(arr.size());                                 //si no agrega nada despues de crear el objeto de vector da una capacidad inicial, 10 por defecto
        System.out.println("arr = " + arr);                             //muestra el contenido del arreglo
    }
}
