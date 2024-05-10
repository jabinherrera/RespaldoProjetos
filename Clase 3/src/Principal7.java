//Fibonacci

public class Principal7 {
    public static void main(String[] args) {
        int numero = 10;

        int fib = fibonacci(numero);
        System.out.println("fib = " + fib);
    }
//Sobre 40 en la variable "número" empieza a demorar
    private static int fibonacci(int numero) {
        if (numero == 1){
            return 1;
        }else{
            return fibonacci(numero-1)+fibonacci(numero - 2);
        }
    }
}
