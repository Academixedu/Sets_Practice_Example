import java.util.TreeSet;
import java.util.Iterator;

public class TreeSets {
    public static void main(String[] args) {
        
        TreeSet<Integer> integerSet = new TreeSet<>();
        TreeSet<Double> doubleSet = new TreeSet<>();
        TreeSet<String> stringSet = new TreeSet<>();

        
        integerSet.add(50);
        integerSet.add(20);
        integerSet.add(30);

       
        doubleSet.add(5.5);
        doubleSet.add(2.2);
        doubleSet.add(3.3);

       
        stringSet.add("Banana");
        stringSet.add("Apple");
        stringSet.add("Cherry");

        
        System.out.println("Integer TreeSet:");
        Iterator<Integer> intIterator = integerSet.iterator();
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
