package Packete1;

/**
 *
 * @author Diego
 */
class Clase1 {

    private String atributoPrivate = "valor Atributo Private";

    private Clase1() {
        System.out.println("Constructor Private");
    }

    public Clase1(String argumento) {
        this();
        System.out.println("Constructor publico");
    }

    private void metodoPrivate() {
        System.out.println("metodo private");
    }

    public String getAtributoPrivate() {
        return atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }
}
