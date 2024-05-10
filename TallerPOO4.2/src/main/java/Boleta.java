import java.util.ArrayList;

public class Boleta {
    private int codigo = 1;
    private ArrayList<Producto> boleta;

    public Boleta() {
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public ArrayList<Producto> getBoleta() {
        return boleta;
    }

    public void generarCodigo() {
        setCodigo(codigo);
        codigo++;
    }

    public void agregarProducto(Producto p, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            boleta.add(p);
        }
    }

    public int totalProductos() {
        int aux = boleta.size();
        return aux;
    }

    public int variedadProductos() {
        int contador;
        int nVariantes = 0;
        ArrayList <Producto> comparador = new ArrayList<>();
        ArrayList<Producto> variedad = new ArrayList<>();
        for (int i = 0; i < boleta.size(); i++) {
            comparador.add(boleta.get(i));
        }
        for (int i = 0; i < boleta.size(); i++) {
            var aux = comparador.get(i);
            comparador.remove(i);
            contador = 0;
            if (aux.equals(boleta.get(i))) {
                contador++;
                if (contador == 0){
                    variedad.add(comparador.get(i));
                }
            }
            comparador.add(aux);
        }
        if (variedad.isEmpty()) {
            System.out.println("No hay variedad");
        }else {
            nVariantes = variedad.size();
        }
        return nVariantes;
    }

    public int obtenerTotal() {
        int acumulador = 0;
        for (int i = 0; i < boleta.size(); i++) {
            acumulador = acumulador + boleta.get(i).getPrecio();
        }
        return acumulador;
    }

    public boolean hayProductos() {
        boolean aux = false;
        if (boleta.size() != 0) {
            aux = true;
        }
        return aux;
    }
}
