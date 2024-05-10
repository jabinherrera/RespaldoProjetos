//Crear una lista de 8 numeros aleatorios
//Que no se repitan
//Con rango del 1 al 10
public class Principal {
    public static void main(String[] args) {

        int[] arrRandom = new int[8];

        for (int i = 0; i < arrRandom.length; i++) {
            var aux= (int)(Math.random()*10)+1;
            for (int j = i; j >= 0  ; j--) {
                if(aux == arrRandom[j]){
                    aux = (int)(Math.random()*10)+1;
                    j=i;
                }
            }
            arrRandom[i] = aux;
        }

        for (int i = 0; i < arrRandom.length; i++) {
            System.out.println("[" + arrRandom[i] + "]");
        }
    }
}
