import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import java.util.Iterator;

class HashmapEx29 {
    public static void main(String args[]) {
        HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
        hm1.put(10, "CSM");
        hm1.put(21, "CSD");
        hm1.put(32, "CSE");
        hm1.put(41, "CSO");
        hm1.put(54, "CSN");
        System.out.println("Hashmap" + hm1);
        Set<Integer> s1 = hm1.keySet();
        Iterator<Integer> it1 = s1.iterator();
        System.out.println("size of HashMap: " + hm1.size());
        System.out.println("Elements of HashMap are: ");
        while (it1.hasNext()) {
            int key = it1.next();
            System.out.println(key + "->" + hm1.get(key));
        }
        it1 = s1.iterator();
        int key = 1;
        while (it1.hasNext()) {
            key = it1.next();
        }
        System.out.println("Key: " + key + " removed value is: " +
                hm1.remove(key));
        System.out.println("Size of HashMap is: " + hm1.size());
        if (hm1.containsKey(key))
            System.out.println(key + " is present in HashMap");
        else
            System.out.println(key + " is not present in HashMap");
        System.out.println("Hashmap" + hm1);
    }
}