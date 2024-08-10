import java.util.TreeSet;
import java.util.Iterator;
public class TreeSets{
public static void main(String[]args){
// Prepare an 3 TreeSet Objects and Load Integer,Double and String On Each Object Iterate them using an Iterator

    TreeSet<Integer> intSet = new TreeSet<>();
    TreeSet<Double> doubleSet = new TreeSet<>();   
    TreeSet<String> stringSet = new TreeSet<>();    

    intSet.add(7);
    intSet.add(8);
    intSet.add(9);
    Iterator<Integer> intIterator = intSet.iterator();
    while (intIterator.hasNext()) {
        System.out.println(intIterator.next());
    }

    doubleSet.add(10.0);
    doubleSet.add(20.0); 
    doubleSet.add(30.0);
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

