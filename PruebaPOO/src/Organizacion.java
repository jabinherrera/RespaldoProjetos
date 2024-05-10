import java.util.HashMap;
import java.util.Map;

public class Organizacion extends Persona{
    String clasificacionE;
    int porcentajeDescuentoCompra;
    int porcentajeDescuentoArriendo;

    public Organizacion(String nombre, String rut, String clasificacionE, int porcentajeDescuentoCompra, int porcentajeDescientoArriendo){
        super(nombre, rut);
        this.clasificacionE = clasificacionE;
        this.porcentajeDescuentoCompra = porcentajeDescuentoCompra;
        this.porcentajeDescuentoArriendo = porcentajeDescuentoArriendo;

    }

    public Map<String,String> arrOrganizacion = new HashMap();

    public void añadirOrganizacion(String rut, String nombre){
        arrOrganizacion.put(rut, nombre);
        System.out.println("La organizacion " + nombre + " fue agregada exitosamente");
    }


}
