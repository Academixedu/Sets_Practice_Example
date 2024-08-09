import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSets {
    public static void main(String[] args) {
         
        LinkedHashSet<Integer> integerSet = new LinkedHashSet<>();
        LinkedHashSet<String> stringSet = new LinkedHashSet<>();
        LinkedHashSet<Double> doubleSet = new LinkedHashSet<>();

       
        integerSet.add(10);
        integerSet.add(20);
        integerSet.add(30);

       
        stringSet.add("Hello");
        stringSet.add("World");
        stringSet.add("Java");

        
        doubleSet.add(10.5);
        doubleSet.add(20.5);
        doubleSet.add(30.5);

        
        System.out.println("Integer LinkedHashSet:");
        Iterator<Integer> intIterator = integerSet.iterator();
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
