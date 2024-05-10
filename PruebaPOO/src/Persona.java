import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Persona {
    String nombre;
    String rut;

    public Scanner teclado = new Scanner(System.in);

    Revista r0 = new Revista("revista-r0",1000,"autor-r0","codigo-r0","tematica-r0");

    Libro l0 = new Libro("nombre-l0",2000,"autor-l0","codigo-l0","tematica-l0","genero-l0");

    Documento d0 = new Documento("nombre",3000,"autor","codigo","clasificacionA");


    public Persona(String nombre, String rut){
        this.nombre = nombre;
        this.rut = rut;
    }

    public Map<String,String> arrPersona = new HashMap();
    public void registrarPersona(String nombre, String rut){
        arrPersona.put(rut,nombre);
    }

    public void definirArticulo(){
        System.out.println("Seleccione que tipo de articulo desea llevar ingresando los siguientes numeros");
        System.out.println("Revistas = 1");
        System.out.println("Libros = 2");
        System.out.println("Diarios = 3");
        System.out.println("Otros = 4");
        int seleccionarArticulo = teclado.nextInt();

        switch (seleccionarArticulo){
            case 1:
                definirCompraArriendo(seleccionarArticulo);
                break;
            case 2:
                definirCompraArriendo(seleccionarArticulo);
                break;
            case 3:
                definirCompraArriendo(seleccionarArticulo);
                break;
            default:
                System.out.println("Seleccione una opcion valida");
                definirArticulo();
        }
    }

    public void definirCompraArriendo(int tipoArticulo){
        System.out.println("Desea comprar o arrendar?");
        System.out.println("Ingrese 1 o 2 segun la accion que desee");
        System.out.println("Comprar = 1");
        System.out.println("Arrendar = 2");
        int compraArriendo = teclado.nextInt();

        switch (compraArriendo){
            case 1:
                realizarCompra(tipoArticulo);
                break;
            case 2:
                realizarArriendo(tipoArticulo);
                break;
            default:
                System.out.println("Seleccione una opcion valida");
                definirCompraArriendo(tipoArticulo);
        }

    }

    public void realizarCompra(int tipoArticulo){
        switch (tipoArticulo){
            case 1:
                r0.eliminarRevista(r0.getCodigo());     //revista
                break;
            case 2:
                l0.eliminarLibro(l0.getCodigo());       //libro
                break;
            case 3:
                d0.eliminarDocumento(l0.getCodigo());   //documento
                break;
            default:
                System.out.println("Seleccione una opcion valida");
                realizarCompra(tipoArticulo);
        }
    }

    public void realizarArriendo(int tipoArticulo){
        switch (tipoArticulo){
            case 1:
                r0.eliminarRevista(r0.getCodigo());
                break;
            case 2:
                l0.eliminarLibro(l0.getCodigo());
                break;
            case 3:
                d0.eliminarDocumento(l0.getCodigo());
                break;
            default:
                System.out.println("Seleccione una opcion valida");
                realizarArriendo(tipoArticulo);
        }
    }
}
