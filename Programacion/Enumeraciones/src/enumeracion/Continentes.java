package enumeracion;

public enum Continentes {
    AFRICA(53),
    EUROPA(46),
    ASIA(34),
    AMERICA(34),
    OCEANIA(45);

    private final int paises;

    private Continentes(int paises) {
        this.paises = paises;
    }

    public int getPaises() {
        return this.paises;
    }
}
