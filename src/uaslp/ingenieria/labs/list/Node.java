package uaslp.ingenieria.labs.list;

public class Node {

    private int dato;
    private Node sig;
    private Node ant;

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Node getSig() {
        return sig;
    }

    public void setSig(Node sig) {
        this.sig = sig;
    }

    public Node getAnt() {
        return ant;
    }

    public void setAnt(Node ant) {
        this.ant = ant;
    }
}
