//Sobrecarga

public class Principal8 {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("num = " + num);
        suma(num);
        suma(num, 10);
    }
    private static void suma(int num, int num2){
        System.out.println("num = " + num+num2);
    }

    private static void suma(int num) {
        System.out.println(num +2);
    }
}
