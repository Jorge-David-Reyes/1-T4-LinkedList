package uaslp.ingenieria.labs.list;

class Node {
    private int data;
    private Node previous;
    private Node next;

    Node(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }


    public Node getBack() {
        return previous;
    }

    public void setBack(Node previous) {
        this.previous = previous;
    }
}