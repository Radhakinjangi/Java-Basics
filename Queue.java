import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue{
    public static void main(String args[]){
        PriorityQueue<String> queue=new PriorityQueue<String>();
        ArrayDeque<Integer> aq=new ArrayDeque<Integer>();
        queue.add("Amit Sharma");
        queue.add("Vijay Raj");
        queue.add("JaiShankar");
        queue.add("Raj");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("removed:"+queue.remove());
        System.out.println("poll is:"+queue.poll());
        System.out.println("after removing two elements:");
        Iterator<String> itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
        System.out.println("contains:"+queue.contains("Raj"));
        for(int i=0;i<=5;i++){
            aq.add(i);
        }
        System.out.println(aq);
        aq.addFirst(6);
        aq.addFirst(7);
        aq.addLast(9);
        aq.addLast(10);
        System.out.println(aq);
    }
}