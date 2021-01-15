import java.util.*;

public class DequeCollection {
    public static void main(String[] args) {
        Deque <Integer> deque = new LinkedList<Integer>() ;
        Queue queue = deque;
       queue.add(1);
       queue.add(2);
       queue.add(3);
       queue.add(4);
        System.out.println(queue);
        int x = deque.pop();
        System.out.println(x);
        System.out.println(queue);
        int y = deque.removeLast();
        System.out.println(y);
        System.out.println(queue);

        }
    }