//Ejemplo de paso por valor

public class Principal2 {
    public static void main(String[] args) {
        int a = 10;
        sumar(a, 2);
        System.out.println(a);                  //muestra 12
    }

    private static void sumar(int num, int i){
        num += 1;
        System.out.println(num);                //muestra 10
    }
}
