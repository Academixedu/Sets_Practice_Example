import java.util.Iterator;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {

        TreeSet<Integer> intSet = new TreeSet<>();
        intSet.add(10);
        intSet.add(5);
        intSet.add(20);

        System.out.println("Integer TreeSet:");
        Iterator<Integer> intIterator = intSet.iterator();
        while (intIterator.hasNext()) {
            System.out.println(intIterator.next());
        }

        TreeSet<Double> doubleSet = new TreeSet<>();
        doubleSet.add(10.5);
        doubleSet.add(5.5);
        doubleSet.add(20.5);

        System.out.println("\nDouble TreeSet:");
        Iterator<Double> doubleIterator = doubleSet.iterator();
        while (doubleIterator.hasNext()) {
            System.out.println(doubleIterator.next());
        }

        TreeSet<String> stringSet = new TreeSet<>();
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Cherry");

        System.out.println("\nString TreeSet:");
        Iterator<String> stringIterator = stringSet.iterator();
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }
    }
}
