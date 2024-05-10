public class Principal {
    public static void main(String[] args) {
        int min = min(2, 4, 3, 5,4, 7, 6, 5, 56, 6, 556);
        System.out.println("min = " + min);
        int minimo = min2(2, 4, 3, 5,4, 7, 6, 5, 56, 6, 556);
        System.out.println("min = " + minimo);
    }

    private static int min(int num1, int num2, int ...arr) {
        // ? es el operador ternario, num1(a la izquierda de : ) si lo que esta antes de ? es verdadero y num2(lo que esta a la derecha de : )
        // si lo que esta antes de ? es falso
        return num1<num2 ? num1 : num2;
    }

    private static int min2(int num1,int ...arr) {
        int minimo = num1;
        for (int i = 0; i < arr.length; i++) {
            if(minimo>arr[i]){
                minimo=arr[i];
            }
        }
        return minimo;
    }
}
