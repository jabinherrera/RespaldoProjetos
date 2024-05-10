public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Punto(){
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Punto obtenerPuntoMedio(Punto p1){
        double cordX = ((p1.getX() + this.getX()) / 2);
        double cordY = ((p1.getY() + this.getY()) / 2);
        return new Punto(cordX, cordY);
    }

    public double obtenerDistancia(Punto p2){

        double distancia;
        if (p2 != null) {
            distancia = Math.hypot(this.x - p2.getX(),this.y -p2.getY());
        } else {
            distancia = Double.NaN;
        }
        return distancia;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
