import java.util.*;

public class List {
    public static void main(String[] args){
        ArrayList<String> a1=new ArrayList<String>();
        ArrayList<Integer> a2=new ArrayList<Integer>();
        LinkedList<Integer> l1=new LinkedList<Integer>();
        Vector<Integer> v1=new Vector<Integer>();
        Stack<String> s1= new Stack<String>();


        for (int i = 1; i <= 5; i++) {
            a2.add(i);
            l1.add(i);
            v1.add(i);
        }
        System.out.println(a1);

        a2.remove(3);
        System.out.println(a2);


        for (int i = 0; i < a2.size(); i++)
            System.out.print(a2.get(i) + " ");

        a1.add("radhika");
        a1.add("Shanti");
        a1.add("Padma");
        a1.add("Swamy");
        Iterator itr=a1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        boolean b = Collections.addAll(a1,"8","9","10");
        System.out.println("result : " + b);
        System.out.println("arrlist after operation : " + a1);

//      a2.addAll(a1);
        a1.clear();
        System.out.println(a1);
        System.out.println(a1.isEmpty());


        s1.push("rajitha");
        s1.push("haritha");
        s1.push("harshith");
        s1.push("ashu");
        s1.pop();
        Iterator<String> itr2 = s1.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
        System.out.println(s1.empty()+" "+s1.search("ashu")+" "+s1.firstElement()+" "+s1.contains("rajitha"));


    }
}
