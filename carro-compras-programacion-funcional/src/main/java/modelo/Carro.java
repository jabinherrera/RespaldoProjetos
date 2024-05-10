package modelo;



public class Carro {
    private double total;
    private int cantidadItems;
    private ArrayList<Producto> productos = new ArrayList<Producto>();

    public Carro() {

    }

    public List<Producto> filtrar(String letra){

        return this.productos.stream()
                .filter(p -> p.getNombre().startsWith(letra))
                .collect(Collectors.toList());
    }

    public double obtenerTotal() {

        double total = this.productos.stream()
                .mapToDouble(x -> x.getPrecio())
                .sum();

        return total;
    }

    public boolean agregarItem(Producto producto) {
        return this.productos.add(producto);
    }


    public boolean removerItem(Producto producto) {
        return this.productos.remove(producto);
    }

    public int obtenerCantidadItems() {
        return this.productos.size();
    }

    public boolean vaciar() {

        this.productos.clear();
        return this.productos.size() == 0;
    }


}