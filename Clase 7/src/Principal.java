import java.util.ArrayList;

//Herencia y polimorfismo
public class Principal {
    public static void main(String[] args) {
        Animal a0 = new Animal("michi", "plomo", 3);
        Animal a1 = new Animal("cachupin", "negro", 10);

        a1.comer("comida para perro");
        a0.comer("wiskas");

        Gato g0 = new Gato("Misufus", "blanco", 4, 20, "montes");
        g0.comer("lauchas");
        g0.dormir();

        Cocodrilo c0 = new Cocodrilo("coco", "verde", 7, 70, 4);

        System.out.println(a0.getEdad());
        System.out.println(g0.getEdad());

        //Esto es polimorfismo, Cocodrilo es tratado como Animal.
        //Aunque el parámetro de entrada era un Animal, pero aun asi podemos usar cocodrilo como un animal debido a la relacion de herencia.
        cumpleaños(a0);
        cumpleaños(c0);
        //Como Gato y Cocodrilo no están relacionados, gato no puede utilizar un metodo de Cocodrilo.
        //Cocodrilo puede ser Animal, pero Animal no puede ser Cocodrilo.
        cambiarColor(c0);
        //cambiarColor(g0);
        //cambiarColor(a0);

        //Esto también es polimorfismo.
        //Clase padre a la izquierda e hija a la derecha.
        Animal g1 = new Gato("garfield", "naranjo", 10, 8, "gato");

        System.out.println();

        //Arreglo polimorfico
        //Permite agregarle objetos de variados tipos.
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Cocodrilo("Croc", "verde", 2, 50, 3));
        animales.add(g0);
        animales.add(g1);
        animales.add(c0);
        animales.add(new Animal("Uron", "negro", 2));

        System.out.println(animales);

        mostrar(animales);

        System.out.println();

        //Como Animal hereda de Objeto y Gato hereda de Animal, Gato puede ser parte de este ArrayList;
        ArrayList<Object> objetos = new ArrayList<>();
        objetos.add(g0);
        //Existe el comentario destacador "to.do", es "to do" no "all"
        //Como es Object puede agregar texto, aunque todo esto seria una pésima practica
        objetos.add("hola mundo");
        System.out.println(objetos);
    }

    public static void cumpleaños(Animal a){
        a.setEdad(a.getEdad()+1);
        System.out.println("Cumpleaños a " + a);
    }

    public static void cambiarColor(Cocodrilo c){
        c.setColor("cafe");
        System.out.println(c);
    }

    public static void mostrar(ArrayList<Animal> animales){
        //Si este for no llevara llaves ejecutaría solo la siguiente linea de codigo.
        for (Animal a: animales){
            //Si el if no tiene llaves, ejecuta solo la siguiente línea de código, también funciona con el for.
            //if(a instanceof Gato)
            System.out.println(a);
        }
    }
}
