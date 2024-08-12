import java.util.Iterator;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        TreeSet<Integer> integerSet = new TreeSet<>();
        TreeSet<Double> doubleSet = new TreeSet<>();
        TreeSet<String> stringSet = new TreeSet<>();

        integerSet.add(5);
        integerSet.add(10);
        integerSet.add(15);

        doubleSet.add(1.5);
        doubleSet.add(2.5);
        doubleSet.add(3.5);

        stringSet.add("Mani");
        stringSet.add("Charan");
        stringSet.add("Chindam");

        Iterator<Integer> intIterator = integerSet.iterator();
        while (intIterator.hasNext()) {
            System.out.println(intIterator.next());
        }

        Iterator<Double> doubleIterator = doubleSet.iterator();
        while (doubleIterator.hasNext()) {
            System.out.println(doubleIterator.next());
        }

        Iterator<String> stringIterator = stringSet.iterator();
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }
    }
}
