import java.util.HashSet;
import java.util.Iterator;

public class HashSets {
    public static void main(String[] args) {
        HashSet<Integer> integerSet = new HashSet<>();
        integerSet.add(10);
        integerSet.add(20);
        integerSet.add(30);

        HashSet<Double> doubleSet = new HashSet<>();
        doubleSet.add(10.5);
        doubleSet.add(20.75);
        doubleSet.add(30.0);

        HashSet<String> stringSet = new HashSet<>();
        stringSet.add("Hello");
        stringSet.add("World");
        stringSet.add("Java");

        System.out.println("Integer HashSet:");
        for (Integer number : integerSet) {
            System.out.println(number);
        }

        System.out.println("\nDouble HashSet:");
        for (Double number : doubleSet) {
            System.out.println(number);
        }

        System.out.println("\nString HashSet:");
        for (String str : stringSet) {
            System.out.println(str);
        }
    }
}
