package uaslp.ingenieria.labs.list;

/**
 * Va a iterar a la lista de atrás para adelante
 */
public class ReverseIterator {

    private Node currentNodeBack;

    public ReverseIterator(Node currentNode) {
        this.currentNodeBack = currentNode;
    }

    public ReverseIterator(ReverseIterator reverseiterator){
        currentNodeBack = reverseiterator.currentNodeBack;
    }

    public boolean hasBack(){
        return currentNodeBack != null;
    }

    public int back(){
        int data = currentNodeBack.getData();

        currentNodeBack = currentNodeBack.getBack();

        return data;
    }

    Node getCurrentNodeBack() {  // modificador de acceso se llama -> package-private
        return currentNodeBack;
    }
}
