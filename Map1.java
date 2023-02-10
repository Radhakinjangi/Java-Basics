import java.util.*;


public class Map1 {
    public static void main(String[] args) {
        //generic

        Map<Integer, String> hm = new HashMap<Integer, String>();
        Map<String,Integer> hm1 = new HashMap<String,Integer>();
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
        hm.put(1, "Geeks");
        hm.put(2, "For");
        hm.put(3, "Geeks");
        hm1.put("vishal",10);
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        //Fetching key
        System.out.println("Keys: "+map.keySet());
        //Fetching value
        System.out.println("Values: "+map.values());
        //Fetching key-value pair
        System.out.println("Key-Value pairs: "+map.entrySet());


        NavigableMap<Integer,String> map1=new TreeMap<Integer,String>();
        map1.put(100,"Amit");
        map1.put(102,"Ravi");
        map1.put(101,"Vijay");
        map1.put(103,"Rahul");
        //Maintains descending order
        System.out.println("descendingMap: "+map1.descendingMap());
        //Returns key-value pairs whose keys are less than or equal to the specified key.
        System.out.println("headMap: "+map1.headMap(102,true));
        //Returns key-value pairs whose keys are greater than or equal to the specified key.
        System.out.println("tailMap: "+map1.tailMap(102,true));
        //Returns key-value pairs exists in between the specified key.
        System.out.println("subMap: "+map1.subMap(100, false, 102, true));

        // Finding the value for a key
        System.out.println("Value for 1 is " + hm.get(1));

        // Traversing through the HashMap
        for (Map.Entry<Integer, String> e : hm.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());

        hm.put(2, "For");
        System.out.println("Updated Map " + hm);

        System.out.println("size of map:"+hm.size());

        hm.remove(4);
        System.out.println("Mappings after removal are : "
                + hm);
        if (hm1.containsKey("vishal")) {

            // Mapping
            Integer a =hm1.get("vishal");

            // Printing value for the corresponding key
            System.out.println("value for key"
                    + " \"Geeks\" is:- " + a);
        }
    }
}

