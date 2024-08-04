
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets {
    // Prepare 3 Linked HashSet Object and Load them With Integer String and Double
    // on Each Object Iterate them by using an Iterator and While Loop

    public static void main(String[] args) {
        LinkedHashSet<Integer> intSet = new LinkedHashSet<>();
        LinkedHashSet<String> stringSet = new LinkedHashSet<>();
        LinkedHashSet<Double> doubleSet = new LinkedHashSet<>();
        intSet.add(4);
        intSet.add(5);
        intSet.add(6);
        Iterator<Integer> intIterator = intSet.iterator();
        while (intIterator.hasNext()) {
            System.out.println(intIterator.next());
        }

        stringSet.add("chaitanya");
        stringSet.add("chaitu");
        Iterator<String> stringIterator = stringSet.iterator();
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }

        doubleSet.add(6.0);
        doubleSet.add(5.0);
        doubleSet.add(5.0);
        Iterator<Double> doubleIterator = doubleSet.iterator();
        while (doubleIterator.hasNext()) {
            System.out.println(doubleIterator.next());
        }
    }
}
