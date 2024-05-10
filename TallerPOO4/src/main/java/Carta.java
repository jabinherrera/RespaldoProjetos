public class Carta implements Comparable<Carta> {
    private String numero;
    private String pinta;
    private int puntos;
    private String color;

    public Carta(String numero, String pinta, int puntos, String color){
        this.numero = numero;
        this.pinta = pinta;
        this.puntos = puntos;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "numero='" + numero + '\'' +
                ", pinta='" + pinta + '\'' +
                ", puntos=" + puntos +
                ", color='" + color + '\'' +
                '}';
    }

    public String getNumero() {
        return numero;
    }

    public int getPuntos() {
        return puntos;
    }

    @Override
    public int compareTo(Carta o) {
        if(o.getNumero().equals(this.numero)){
            return 0;
        }else {
            int numero1;
            try{
                numero1 = Integer.parseInt(o.getNumero());
            }catch(Exception e){
                numero1= (int)(o.getNumero().charAt(0));
            }
            int numero2;
            try{
                numero2 = Integer.parseInt(this.getNumero());
            }catch(Exception e){
                numero2 = (int)(this.getNumero().charAt(0));
            }
            if(numero1< numero2){
                return -1;
            }else{
                return 1;
            }
        }
    }
}