import java.util.TreeMap;
import java.util.Random;
import java.util.Iterator;
import java.util.Set;

class TreeMapEx30 {
    public static void main(String args[]) {
        TreeMap<Integer, String> tm1 = new TreeMap<Integer, String>();
        tm1.put(10, "CSM");
        tm1.put(41, "CSD");
        tm1.put(3, "CSE");
        tm1.put(31, "CSO");
        tm1.put(54, "CSN");
        System.out.println("Tree map Before " + tm1);
        tm1.put(54, "ECE");
        System.out.println("Tree map After " + tm1);
        System.out.println("Values of TreeMap are: ");
        Set<Integer> ks1 = tm1.keySet();
        Iterator<Integer> it1 = ks1.iterator();
        int k = 0;
        while (it1.hasNext()) {
            k = it1.next();
            System.out.println(k + "->" + tm1.get(k));
        }
        tm1.remove(k);
        if (tm1.containsKey(31)) {
            System.out.println("Key 31 is found\n");
        }
        System.out.println("Tree map after removing key pair" + tm1);
    }
}