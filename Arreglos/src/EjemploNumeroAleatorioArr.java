//Ejemplo para demostrar HashSet vs arr[]

public class EjemploNumeroAleatorioArr {
    public static void main(String[] args) {
        //crear un arreglo de largo 10 con numeros aleatorios sin repetir
        //del 1 al 15

        //con arreglo
        int[] kino  = new int[10];

        for (int i=0;i<kino.length;i++){                //llenado del arreglo con numero aleatorio del 1 al 15
            var aux = (int)(Math.random()*15)+1;
            for (int j = i; j >= 0; j--) {              //revisa si hay repetidos, revisa desde i si j coincide con un i anterior o igual, por eso (int j = i; j >= 0; j--)
                if(aux == kino[j]){
                    aux = (int)(Math.random()*15)+1;
                    j=i;                                //si el numero j ya existe en el arreglo vuelve a empezar, por eso j=i
                }
            }
            kino[i] = aux;
        }

        for (int i = 0; i < kino.length; i++) {         //muestra el contenido del arreglo
            System.out.println("[" + kino[i] + "]");
        }
    }
}
