public class Principal6 {
    public static void main(String[] args) {
        int num = 10;
        int factorial = factorial(num);
    }

    private static int factorial(int numero) {
        if (numero == 1){
            return 1;
        }else{
            return factorial(numero-1)*numero;
        }
    }
}
