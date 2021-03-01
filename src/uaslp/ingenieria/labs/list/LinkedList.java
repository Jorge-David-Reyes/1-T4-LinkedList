package uaslp.ingenieria.labs.list;

/**
 * Lista doblemente ligada
 */
public class LinkedList {

    public static final int BEFORE = 0;
    public static final int AFTER = 1;

    private Node head;
    private Node tail;
    private int size;

    /**
     * Inserts data at the end of the list
     *
     * @param data Data to be inserted
     */
    public void add(int data) {
        Node node = new Node(data);

        node.setPrevious(tail);

        if (tail != null) {
            tail.setNext(node);
        }

        if (head == null) {
            head = node;
        }

        tail = node;
        size++;
    }

    /**
     * @param index 0-index
     * @return data in index
     */
    public int get(int index) {
        Node currentNode = head;
        int currentIndex = 0;

        while (currentIndex < index) {
            currentNode = currentNode.getNext();
            currentIndex++;
        }

        return currentNode.getData();
    }

    public void delete(int index) {
        Node currentNode = head;
        int currentIndex = 0;

        if (index < 0 || index >= size) {
            return;
        }

        size--;

        if (size == 0) {
            head = null;
            tail = null;
            return;
        }

        if (index == 0) {
            head = head.getNext();
            head.setPrevious(null);
        }

        if (index == size) {
            tail = tail.getPrevious();
            tail.setNext(null);
        }

        if (index > 0 && index < size) {
            while (currentIndex < index) {
                currentNode = currentNode.getNext();
                currentIndex++;
            }
            currentNode.getPrevious().setNext(currentNode.getNext());
            currentNode.getNext().setPrevious(currentNode.getPrevious());
        }


    }

    public Iterator getIterator() {
        return new Iterator(head);
    }

    public void insert(int data, int position, Iterator it) {
        // ¿qué ofrece java para restringir los valores de position a solamente BEFORE y AFTER?

        Node newNode = new Node(data);
        Node currentNode = it.getCurrentNode();

        if (position == AFTER) {
            newNode.setNext(currentNode.getNext());
            newNode.setPrevious(currentNode);
            currentNode.setNext(newNode);
            if (newNode.getNext() != null) {
                newNode.getNext().setPrevious(newNode);
            } else {
                tail = newNode;
            }
        } else if (position == BEFORE) {
            newNode.setPrevious(currentNode.getPrevious());
            newNode.setNext(currentNode);
            currentNode.setPrevious(newNode);
            if (newNode.getPrevious() != null) {
                newNode.getPrevious().setNext(newNode);
            } else {
                head = newNode;
            }
        } else {
            System.out.println("No conozco el valor de position");
        }
        size++;
    }


    //Iterador -> patrón de diseño

    public int getSize() {
        return size;
    }

    public ReverseIterator getReverseIterator() {
        return new ReverseIterator(tail);
    }
}
