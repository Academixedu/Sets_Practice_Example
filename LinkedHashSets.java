import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSets {
    public static void main(String[] args) {
        LinkedHashSet<Integer> integerSet = new LinkedHashSet<>();
        integerSet.add(10);
        integerSet.add(20);
        integerSet.add(30);

        LinkedHashSet<Double> doubleSet = new LinkedHashSet<>();
        doubleSet.add(10.5);
        doubleSet.add(20.75);
        doubleSet.add(30.0);

        LinkedHashSet<String> stringSet = new LinkedHashSet<>();
        stringSet.add("Hello");
        stringSet.add("World");
        stringSet.add("Java");

        System.out.println("Integer LinkedHashSet:");
        Iterator<Integer> integerIterator = integerSet.iterator();
        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }

        System.out.println("\nDouble LinkedHashSet:");
        Iterator<Double> doubleIterator = doubleSet.iterator();
        while (doubleIterator.hasNext()) {
            System.out.println(doubleIterator.next());
        }

        System.out.println("\nString LinkedHashSet:");
        Iterator<String> stringIterator = stringSet.iterator();
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }
    }
}
