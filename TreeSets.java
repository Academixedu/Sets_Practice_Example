
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        // Prepare an 3 TreeSet Objects and Load Integer,Double and String On Each
        // Object Iterate them using an Iterator
        TreeSet<Integer> intSet = new TreeSet<>();
        TreeSet<Double> doubleSet = new TreeSet<>();
        TreeSet<String> stringSet = new TreeSet<>();

        intSet.add(1);
        intSet.add(2);
        intSet.add(0);
        Iterator<Integer> intIterator = intSet.iterator();
        while (intIterator.hasNext()) {
            System.out.println(intIterator.next());
        }

        doubleSet.add(1.0);
        doubleSet.add(2.0);
        doubleSet.add(3.0);
        Iterator<Double> doubleIterator = doubleSet.iterator();
        while (doubleIterator.hasNext()) {
            System.out.println(doubleIterator.next());
        }

        stringSet.add("chaitanya");
        stringSet.add("chaitu");
        Iterator<String> stringIterator = stringSet.iterator();
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }
    }
}
