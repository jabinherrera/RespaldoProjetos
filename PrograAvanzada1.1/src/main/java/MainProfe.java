import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainProfe {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(23, 56, 4, 1, 0, 78, 12, 19, 8);
        List<Integer> numMayores = new ArrayList<>();

        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();

        //Se podria decir que stream hace la funcion del for
        //count devuelve un Long
        Long result = numeros.stream().filter(num -> num > a).count();
        System.out.println(result);

        numMayores = numeros.stream().filter(num -> num > a).collect(Collectors.toList());
        System.out.println(numMayores);
    }
}
