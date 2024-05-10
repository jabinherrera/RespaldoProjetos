import java.util.ArrayList;

public class JuegoCarta {
    public static void main(String[] args) {
        int cartasCarioca =12;
        Mazo m = new Mazo();
        m.generarMazo("Azul");
        m.generarMazo("Rojo");

        System.out.println(m.getMazo().size());
        m.revolverMazo(10000);

        Mano m1 = new Mano("Paula");
        Mano m2 = new Mano("Diego");
        Mano m3 = new Mano("Francisco");
        m.repartir(cartasCarioca,m1);
        m.repartir(cartasCarioca,m2);
        m.repartir(cartasCarioca,m3);

        m1.mostrarCartas();
        System.out.println();
        m1.ordenarSegunNumero();
        m1.mostrarCartas();

        System.out.println(m.getMazo().size());

    }
}