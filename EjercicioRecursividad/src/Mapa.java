public class Mapa {
    private int dimension = 9;  //La dimension del mapa/tablero siempre será 1 menos, pues parte en 0
    private String[][] mapa = new String[dimension][dimension];
    private String isla = "[1]";
    private String mar = "[0]";


    //Crea una matriz 9x9 llena de ceros, realmente de 8x8 después de agregar el borde
    public void generarMapa(){
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                mapa[i][j] = mar;
            }
        }
        generarBorde();
    }
    //Muestra el tablero en pantalla
    public void imprimirMapa() {
        //Muestra el mapa
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(mapa[i][j] + "\t");     //tiene que ser print no println
            }
            System.out.println("\n");
        }
    }
    //Agrega un borde al mapa
    private void generarBorde(){
        for (int i = 0; i < dimension; i++) {
            mapa[i][0] = " " + i;
        }
        for (int j = 0; j < dimension; j++) {
            mapa[0][j] = " " + j;
        }
    }
    //Permite agregar una isla en el mapa ingresando coordenadas
    public void insertarIsla(int x, int y){
        mapa[x][y] = isla;
    }
    //Agrega islas en el mapa de manera aleatoria un X número de veces representado por la variable "num"
    public void insertarIslaRandom(int num){
        for (int i = 0; i < num+1; i++) {
            int xRandom = (int)(Math.random()*(dimension-1))+1;
            int yRandom = (int)(Math.random()*(dimension-1))+1;
            insertarIsla(xRandom, yRandom);
        }
    }
    //Destaca las coordenadas que son islas
    public void resaltarIslas(){
        String remplazo = " 0";
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if(mapa[i][j] == mar){
                    mapa[i][j] = remplazo;
                }
            }
        }
        imprimirMapa();
    }

    //Muestra las coordenadas de las islas
    public void coordenadasIslas(){
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if(mapa[i][j] == isla){
                    System.out.println("("+j+", "+i+")"+"\n");
                }
            }
        }
    }
}
