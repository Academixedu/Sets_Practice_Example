import java.util.HashSet;
import java.util.Iterator;
public class HashSets{
public static void main(String[]args){
// Prepare an 3 HashSet Objects and Load Integer,Double and String On Each Object Iterate them using an Iterator

        HashSet<Integer> intSet = new HashSet<>();
        HashSet<Double> doubleSet = new HashSet<>();
        HashSet<String> stringSet = new HashSet<>();

        intSet.add(5);
        intSet.add(2);
        intSet.add(3);
        Iterator<Integer> intIterator = intSet.iterator();
        while (intIterator.hasNext()) {
            System.out.println(intIterator.next());
        }

        doubleSet.add(1.0);
        doubleSet.add(2.0);
        doubleSet.add(3.0);
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
