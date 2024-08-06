import java.util.TreeSet;
import java.util.Iterator;

public class TreeSets {
    public static void main(String[] args) {
        // Create TreeSet objects
        TreeSet<Integer> intSet = new TreeSet<>();
        TreeSet<Double> doubleSet = new TreeSet<>();
        TreeSet<String> stringSet = new TreeSet<>();

        // Add elements to each TreeSet
        intSet.add(4);
        intSet.add(5);
        intSet.add(6);

        doubleSet.add(4.4);
        doubleSet.add(5.5);
        doubleSet.add(6.6);

        stringSet.add("Four");
        stringSet.add("Five");
        stringSet.add("Six");

        // Iterate over each TreeSet using an Iterator
        System.out.println("Integer TreeSet:");
        Iterator<Integer> intIterator = intSet.iterator();
        while (intIterator.hasNext()) {
            System.out.println(intIterator.next());
        }

        System.out.println("\nDouble TreeSet:");
        Iterator<Double> doubleIterator = doubleSet.iterator();
        while (doubleIterator.hasNext()) {
            System.out.println(doubleIterator.next());
        }

        System.out.println("\nString TreeSet:");
        Iterator<String> stringIterator = stringSet.iterator();
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }
    }
}
