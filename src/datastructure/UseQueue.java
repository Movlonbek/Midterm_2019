package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */

        Queue<Integer> Q = new LinkedList<>();
        Q.add(210);
        Q.add(255);
        Q.add(295);
        Q.add(305);
        Q.remove(305);

        System.out.println(Q);

        System.out.println(Q.peek());

        for (Integer item: Q){
            System.out.println(item);
        }

        Iterator<Integer> itr = Q.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
