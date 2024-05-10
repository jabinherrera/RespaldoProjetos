package LOL;

import java.util.List;

public class CuerpoACuerpo extends Campeon {

    public CuerpoACuerpo(int oroAcumulado, int nivel, int daño, int armadura, int vida, double velocidadDeAtaque) {
        super(oroAcumulado, nivel, daño, armadura, vida, velocidadDeAtaque);
    }

    @Override
    void generarConjuntoHabilidades() {
        ConjuntoHabilidad conjuntoHabilidad = new ConjuntoHabilidad();
    }
}