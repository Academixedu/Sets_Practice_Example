import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class LinkedHashSets{
// Prepare 3 Linked HashSet Object and Load them With Integer String and Double on Each Object Iterate them by using an Iterator and While Loop

public static void main(String[]args){
    Set<Integer> list = new LinkedHashSet<Integer>();
    list.add(10);
    list.add(20);
    list.add(30);
    Iterator<Integer> itr = list.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
    Set<String> list1 = new LinkedHashSet<String>();
    list1.add("a");
    list1.add("b");
    list1.add("c");
    Iterator<String> itr1 = list1.iterator();
    while(itr1.hasNext()){
        System.out.println(itr1.next());
    }
    Set<Double> list2 = new LinkedHashSet<Double>();
    list2.add(1.0);
    list2.add(2.0);
    list2.add(3.0);
    Iterator<Double> itr2 = list2.iterator();
    while(itr2.hasNext()){
        System.out.println(itr2.next());
    }
}
}
