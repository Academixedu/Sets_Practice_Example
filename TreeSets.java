import java.util.Iterator;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Iterator<Integer> i = set1.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        TreeSet<Double> set2 = new TreeSet<>();
        set2.add(2.7);
        set2.add(2.8);
        set2.add(2.9);
        Iterator<Double> j = set2.iterator();
        while (j.hasNext()) {
            System.out.println(j.next());
        }

        TreeSet<String> set3 = new TreeSet<>();
        set3.add("Hello");
        set3.add("World");
        set3.add("Java");
        Iterator<String> n = set3.iterator();
        while (n.hasNext()) {
            System.out.println(n.next());
        }
    }
}
