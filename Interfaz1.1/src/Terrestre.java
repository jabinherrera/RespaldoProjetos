public class Terrestre extends Animal{
    private int patas;

    public Terrestre(String nombre, int edad, int patas) {
        super.nombre = nombre;                              //hay que declarar los metodos de la clase abstracta
        super.edad = edad;
        this.patas = patas;
    }

    public int caminar(){
        System.out.println("caminando");
        return 1;
    }

    @Override                                               //ahora que la clase Animal es abstracta, hay que implementar sus metodos
    String getNombre() {
        return super.nombre;
    }

    @Override                                               //afecta a la funcion "mostrar" en main
    public String toString() {                              //con esto no solo muestra el nombre, muestra todos los parametros
        return super.toString()+"Terrestre{" +              //concatenar "super.toString()+
                "patas=" + patas +
                '}';
    }
}