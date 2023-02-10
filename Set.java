import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String args[]) {
        HashSet<Integer> hs = new HashSet<Integer>();
        LinkedHashSet<String> ls = new LinkedHashSet<String>();
        TreeSet<String> ts = new TreeSet<String>();
        for (int i = 0; i < 10; i++) {
            hs.add(i);
        }
        System.out.println(hs);
        ls.add("Ravi");
        ls.add("Vijay");
        ls.add("Ravi");
        ls.add("Ajay");
        ls.stream();
//Traversing elements
        Iterator<String> itr = ls.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
        ts.add("Ravi");
        ts.add("Vijay");
        ts.add("Ravi");
        ts.add("Ajay");
        Iterator<String> itr2 = ts.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}
