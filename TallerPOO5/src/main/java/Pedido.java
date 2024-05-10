import java.util.ArrayList;
import java.util.Arrays;

public class Pedido {
    private ArrayList<Producto> arrProductos;
    private int precioTotal;
    private ArrayList<ArrayList<Producto>> boletas;
    private ArrayList<Producto> productosMasVendidos;
    private ArrayList<Producto> productosMasCaros;

    public ArrayList<Producto> getArrProductos() {
        return arrProductos;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void agregarProductor(Producto producto){
        arrProductos.add(producto);
        precioTotal = producto.getPrecio()+precioTotal;
        producto.setCantidadEnBoletas(producto.getCantidadEnBoletas()+1);
    }

    public boolean verificarTotal(){
        if (precioTotal >= 20000) {
            return true;
        }else{
            return false;
        }
    }

    public void descuento(){
        if (verificarTotal() == true) {
            int[] precios = new int[arrProductos.size()];

            for (Producto p : arrProductos){
                int aux = p.getPrecio();
                for (int i = 0; i < arrProductos.size(); i++) {
                    precios[i] = aux;
                }
            }

            int precioProductoMasCaro = Arrays.stream(precios)
                    .max()
                    .getAsInt();

            var x = 25/100;
            precioTotal = precioTotal - (precioProductoMasCaro * x);
        }
    }

    public void mostrarProductoMasCaro(){
        int[] precios = new int[arrProductos.size()];

        for (Producto p : arrProductos){
            int aux = p.getPrecio();
            for (int i = 0; i < arrProductos.size(); i++) {
                precios[i] = aux;
            }
        }

        int precioProductoMasCaro = Arrays.stream(precios)
                .max()
                .getAsInt();

        for (int i = 0; i < arrProductos.size(); i++) {
            if (precioProductoMasCaro == arrProductos.get(i).getPrecio()) {
                System.out.println(arrProductos.get(i));
            }
        }
    }

    public void imprimirBoleta(){
        System.out.println("Precio total = " + precioTotal);
        System.out.println("arrProductos.stream() = " + arrProductos.stream());
        mostrarProductoMasCaro();
        boletas.add(this.arrProductos);
    }

    public void listaBoletas(){
        System.out.println("boletas = " + boletas.stream());
    }

    public void cincoProductosMasVendidos(){
        int[] nBoletas = new int[arrProductos.size()];
        var auxProductos = arrProductos;

        for (int i = 0; i < 4; i++) {
            for (Producto p : auxProductos){
                int aux = p.getCantidadEnBoletas();
                for (int j = 0; j < auxProductos.size(); j++) {
                    nBoletas[j] = aux;
                }
            }

            int maxBoletas = Arrays.stream(nBoletas)
                    .max()
                    .getAsInt();

            for (int j = 0; j < auxProductos.size(); j++) {
                if (maxBoletas == auxProductos.get(j).getCantidadEnBoletas()) {
                    productosMasVendidos.add(auxProductos.get(j));
                    auxProductos.remove(j);
                }
            }
        }
    }

    public void reiniciarCantidadEnBoletas(Producto producto){
        producto.setCantidadEnBoletas(0);
    }

    public void cincoProductosMasCaros(){

        int[] precio = new int[arrProductos.size()];
        var auxProductos = arrProductos;

        for (int i = 0; i < 4; i++) {
            for (Producto p : auxProductos){
                int aux = p.getPrecio();
                for (int j = 0; j < auxProductos.size(); j++) {
                    precio[j] = aux;
                }
            }

            int precioMax = Arrays.stream(precio)
                    .max()
                    .getAsInt();

            for (int j = 0; j < auxProductos.size(); j++) {
                if (precioMax == auxProductos.get(j).getPrecio()) {
                    productosMasCaros.add(auxProductos.get(j));
                    auxProductos.remove(j);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "arrProductos=" + arrProductos +
                ", precioTotal=" + precioTotal +
                ", boletas=" + boletas +
                '}';
    }
}
