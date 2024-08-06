import java.util.HashSet;
import java.util.Iterator;

public class HashSets {
    public static void main(String[] args) {
        // Create HashSet objects
        HashSet<Integer> intSet = new HashSet<>();
        HashSet<Double> doubleSet = new HashSet<>();
        HashSet<String> stringSet = new HashSet<>();

        // Add elements to each HashSet
        intSet.add(4);
        intSet.add(5);
        intSet.add(6);

        doubleSet.add(4.4);
        doubleSet.add(5.5);
        doubleSet.add(6.6);

        stringSet.add("Four");
        stringSet.add("Five");
        stringSet.add("Six");

        // Iterate over each HashSet using an Iterator
        System.out.println("Integer HashSet:");
        Iterator<Integer> intIterator = intSet.iterator();
        while (intIterator.hasNext()) {
            System.out.println(intIterator.next());
        }

        System.out.println("\nDouble HashSet:");
        Iterator<Double> doubleIterator = doubleSet.iterator();
        while (doubleIterator.hasNext()) {
            System.out.println(doubleIterator.next());
        }

        System.out.println("\nString HashSet:");
        Iterator<String> stringIterator = stringSet.iterator();
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }
    }
}
