import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;



public class Java8Sort {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        l.add("Radhika");
        l.add("Shanti");
        l.add("Mummy");

        List<String> l1 = new ArrayList<String>();
        l1.add("Radhika");
        l1.add("Shanti");
        l1.add("Mummy");

        Java8Sort tester = new Java8Sort();
        tester.sortjava7(l);
        System.out.println(l);
        tester.sortjava8(l1);
        System.out.println(l1);
    }

        private void sortjava7(List<String> names){
            Collections.sort(names,new Comparator<String>()
                    {
                        @Override
                        public int compare(String s1,String s2){
                            return s1.compareTo(s2);
                        }
                    });

        }
        private void sortjava8(List<String> names){
            Collections.sort(names,(s1,s2)->s1.compareTo(s2));

        }

}
