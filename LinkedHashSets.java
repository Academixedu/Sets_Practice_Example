import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Iterator;
public class LinkedHashSets{
public static void main(String[]args){
    // Prepare 3 Linked HashSet Object and Load them With Integer String and Double on Each Object Iterate them by using an Iterator and While Loop
       LinkedHashSet<Integer> intSet = new LinkedHashSet<>();
        LinkedHashSet<Double> doubleSet = new LinkedHashSet<>();
        LinkedHashSet<String> stringSet = new LinkedHashSet<>();

        intSet.add(3);
        intSet.add(4);
        intSet.add(6);
        Iterator<Integer> intIterator = intSet.iterator();
        while (intIterator.hasNext()) {
            System.out.println(intIterator.next());
        }

        doubleSet.add(3.0);
        doubleSet.add(2.0);
        doubleSet.add(5.0);
        Iterator<Double> doubleIterator = doubleSet.iterator();
        while (doubleIterator.hasNext()) {
            System.out.println(doubleIterator.next());
        }

        stringSet.add("swapna");    
        stringSet.add("Rocky");
        stringSet.add("soppi");
        Iterator<String> stringIterator = stringSet.iterator(); 
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }
    }
}
