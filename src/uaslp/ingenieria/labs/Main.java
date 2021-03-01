package uaslp.ingenieria.labs;

import uaslp.ingenieria.labs.list.Iterator;
import uaslp.ingenieria.labs.list.LinkedList;
import uaslp.ingenieria.labs.list.ReverseIterator;

public class Main {

    public static void main(String[] args) {

        LinkedList lista1 = new LinkedList();

        lista1.add(1);
        lista1.add(4);
        lista1.add(3);
        lista1.add(7);

        Iterator it = lista1.getIterator();

        while(it.hasNext()){
            Iterator backupIt = new Iterator(it);
            int element = it.next(); //regresar el dato y avanzar el iterador

            if(element == 3){
                lista1.insert(10, LinkedList.BEFORE, backupIt);
            }

            if(element == 7){
                lista1.insert(15, LinkedList.AFTER, backupIt);
            }
        }

        lista1.delete(3);

        System.out.println("---------------------");

        System.out.println("El tamaño es:" + lista1.getSize());

        it = lista1.getIterator();

        while(it.hasNext()){
            int element = it.next();

            System.out.println("Dato: " + element);
        }

        System.out.println("---------------------");

        ReverseIterator reverseIterator = lista1.getReverseIterator();

        while(reverseIterator.hasBack()){
            int element = reverseIterator.back();

            System.out.println("Dato: " + element);
        }

    }
}

