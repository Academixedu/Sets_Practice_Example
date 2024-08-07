import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSets{
    public static void main(String[]args){
// Prepare 3 Linked HashSet Object and Load them With Integer String and Double on Each Object Iterate them by using an Iterator and While Loop
    LinkedHashSet<Integer> intSet=new LinkedHashSet<>();
    LinkedHashSet<String> stringSet=new LinkedHashSet<>();
    LinkedHashSet<Double> doubleSet=new LinkedHashSet<>();
    

    intSet.add(20);
    intSet.add(10);
    intSet.add(30);

    stringSet.add("Dettol");
    stringSet.add("Aa");
    stringSet.add("Pepsodent");

    doubleSet.add(4.1);
    doubleSet.add(2.2);
    doubleSet.add(3.3); 

    Iterator<Integer> intIterator= intSet.iterator();
    while(intIterator.hasNext()){
        System.out.println(intIterator.next());
    }

    Iterator<String> stringIterator= stringSet.iterator();
    while(stringIterator.hasNext()){
        System.out.println(stringIterator.next());
    }

    Iterator<Double> doubleIterator= doubleSet.iterator();
    while(doubleIterator.hasNext()){
        System.out.println(doubleIterator.next());
    }

}
}
