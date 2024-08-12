import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets {
    public static void main(String[] args) {
        LinkedHashSet<Integer> integerSet = new LinkedHashSet<>();
        LinkedHashSet<String> stringSet = new LinkedHashSet<>();
        LinkedHashSet<Double> doubleSet = new LinkedHashSet<>();

        integerSet.add(10);
        integerSet.add(20);
        integerSet.add(30);

        stringSet.add("Mani");
        stringSet.add("Charan");
        stringSet.add("Chindam");

        doubleSet.add(1.1);
        doubleSet.add(2.2);
        doubleSet.add(3.3);

        Iterator<Integer> intIterator = integerSet.iterator();
        while (intIterator.hasNext()) {
            System.out.println(intIterator.next());
        }

        Iterator<String> stringIterator = stringSet.iterator();
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }

        Iterator<Double> doubleIterator = doubleSet.iterator();
        while (doubleIterator.hasNext()) {
            System.out.println(doubleIterator.next());
        }
    }
}
