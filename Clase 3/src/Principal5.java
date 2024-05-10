public class Principal5 {
    public static void main(String[] args) {
        int i = 10;
        contar(i);
    }

    private static void contar(int i) {         //Un contador
        for (int j = 0; j < i; j++) {
            System.out.println(j+1);            //+1 para que no parta de 0
        }
    }
//Recursividad
    private static int contarSinCiclos(int i){
        System.out.println(i);
        if(i>0){
            return contarSinCiclos(i-i);        //Debe llamarse a si mismo
        }else{
            return 0;                               //Debe tener una condicion de fin
        }
    }

}
