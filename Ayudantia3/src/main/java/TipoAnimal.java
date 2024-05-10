public enum TipoAnimal {
    //Instancia

    //Valores definidos

    //Atributos de la clase

    //Constructor privado

    PERRO("Perro"),
    GATO("Gato");

    private String tipo;

    TipoAnimal(String tipo) {
        this.tipo = tipo;
    }

    public String getTipoAnimal() {
        return tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
