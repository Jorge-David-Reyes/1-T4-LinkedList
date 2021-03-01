package uaslp.ingenieria.labs.list;

public class Iterator {
    private Node currentNode;

    public Iterator(Node currentNode) {
        this.currentNode = currentNode;
    }

    public Iterator(Iterator iterator){
        currentNode = iterator.currentNode;
    }

    public boolean hasNext(){
        return currentNode != null;
    }

    public int next(){
        int data = currentNode.getData();

        currentNode = currentNode.getNext();

        return data;
    }

    Node getCurrentNode() {  // modificador de acceso se llama -> package-private
        return currentNode;
    }
}