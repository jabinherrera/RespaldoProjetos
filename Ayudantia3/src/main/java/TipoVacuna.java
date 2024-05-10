public enum TipoVacuna {
    TIPO1("Tipo 1"),
    TIPO2("Tipo 2");

    private String tipoVacuna;

    TipoVacuna(String tipoVacuna) {
        this.tipoVacuna = tipoVacuna;
    }

    public String getTipoVacuna() {
        return tipoVacuna;
    }
}
