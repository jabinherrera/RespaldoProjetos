package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class CarroDeCompra {
    private ArrayList<Producto> products = new ArrayList<Producto>();

    public CarroDeCompra(ArrayList<Producto> products) {
        this.products = products;
    }

    public CarroDeCompra() {
    }

    //For each
    //Ingreso el array o arrayList que quiero trabajar
    //Digo el tipo y el nombre del dato en singular
    //En el cuerpo digo lo que quiero que haga el n veces
    //n es igual al tamaño del arreglo
    public double obtenerBalance(){
        double balance = 0;
        for (Producto product : products) {
            balance += product.getPrecio();
        }
        System.out.println(balance);
        return balance;
    }

    public void agregarItem(Producto nuevoProducto){
        products.add(nuevoProducto);
    }

    public void removerItem(int indexParaRemover){
        products.remove(indexParaRemover);
    }

    public int obtenerCantidadItem(Producto producto){
        System.out.println(Collections.frequency(products, producto));
        return Collections.frequency(products, producto);
    }

    public void vaciar(){
        products.clear();
    }

    public ArrayList<Producto> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Producto> products) {
        this.products = products;
    }
}
