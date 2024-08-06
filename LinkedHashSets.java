import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSets {
    public static void main(String[] args) {
        // Create LinkedHashSet objects
        LinkedHashSet<Integer> intSet = new LinkedHashSet<>();
        LinkedHashSet<String> stringSet = new LinkedHashSet<>();
        LinkedHashSet<Double> doubleSet = new LinkedHashSet<>();

        // Add elements to each LinkedHashSet
        intSet.add(4);
        intSet.add(5);
        intSet.add(6);

        stringSet.add("Four");
        stringSet.add("Five");
        stringSet.add("Six");

        doubleSet.add(4.4);
        doubleSet.add(5.5);
        doubleSet.add(6.6);

        // Iterate over each LinkedHashSet using an Iterator and while loop
        System.out.println("Integer LinkedHashSet:");
        Iterator<Integer> intIterator = intSet.iterator();
        while (intIterator.hasNext()) {
            System.out.println(intIterator.next());
        }

        System.out.println("\nString LinkedHashSet:");
        Iterator<String> stringIterator = stringSet.iterator();
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }

        System.out.println("\nDouble LinkedHashSet:");
        Iterator<Double> doubleIterator = doubleSet.iterator();
        while (doubleIterator.hasNext()) {
            System.out.println(doubleIterator.next());
        }
    }
}
