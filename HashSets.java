import java.util.HashSet;
import java.util.Iterator;

public class HashSets{
    public static void main(String[]args){
// Prepare an 3 HashSet Objects and Load Integer,Double and String On Each Object Iterate them using an Iterator

        HashSet<Integer> intSet = new HashSet<>();
        HashSet<Double> doubleSet = new HashSet<>();
        HashSet<String> stringSet = new HashSet<>();

        intSet.add(10);
        intSet.add(01);

        doubleSet.add(4.1);
        doubleSet.add(2.2);

        stringSet.add("Kashifa");
        stringSet.add("Aa");

        Iterator<Integer> intIterator= intSet.iterator();
        while(intIterator.hasNext()){
            System.out.println(intIterator.next());
        }

        Iterator<Double> doubleIterator= doubleSet.iterator();
        while(doubleIterator.hasNext()){
            System.out.println(doubleIterator.next());
        }

        Iterator<String> stringIterator= stringSet.iterator();
        while(stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }


}
}
