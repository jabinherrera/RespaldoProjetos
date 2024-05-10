public class Terrestre extends Animal{
    private int patas;

    public Terrestre(String nombre, int edad, int patas) {
        super(nombre, edad);
        this.patas = patas;
    }

    public int caminar(){
        System.out.println("caminando");
        return 1;
    }

    @Override                                           //afecta a la funcion "mostrar" en main
public String toString() {                              //con esto no solo muestra el nombre, muestra todos los parametros
        return super.toString()+"Terrestre{" +          //concatenar "super.toString()+
                "patas=" + patas +
                '}';
    }
}
