import java.util.TreeSet;
import java.util.Iterator;

public class TreeSets{
    public static void main(String[]args){
// Prepare an 3 TreeSet Objects and Load Integer,Double and String On Each Object Iterate them using an Iterator

        TreeSet<Integer> intSet = new TreeSet<>();  
        TreeSet<Double> doubleSet = new TreeSet<>();
        TreeSet<String> stringSet = new TreeSet<>();  
        
        intSet.add(20);
        intSet.add(10);
        intSet.add(30);
        
        doubleSet.add(1.1);
        doubleSet.add(2.2);
        doubleSet.add(1.3);

        stringSet.add("Zz");
        stringSet.add("Abc");
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
