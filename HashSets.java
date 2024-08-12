import java.util.HashSet;
import java.util.Iterator;

public class HashSets {
    public static void main(String[] args) {
        HashSet<Integer> integerSet = new HashSet<>();
        HashSet<Double> doubleSet = new HashSet<>();
        HashSet<String> stringSet = new HashSet<>();

        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);

        doubleSet.add(1.1);
        doubleSet.add(2.2);
        doubleSet.add(3.3);

        stringSet.add("Mani");
        stringSet.add("Charan");
        stringSet.add("Chindam");

        System.out.println("Integer HashSet:");
        Iterator<Integer> intIterator = integerSet.iterator();
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
