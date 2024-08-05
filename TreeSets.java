

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSets{
public static void main(String[]args){
    Set<Integer> set1 = new TreeSet<Integer>(); 
    set1.add(100000);set1.add(765);set1.add(765);
    set1.add(70);set1.add(400000);set1.add(100000);
    set1.add(2997980);
    Iterator it = set1.iterator(); //output will print irrespective of the vlaues
    while (it.hasNext()) {          // in the set that may be in any order because
        System.out.println(it.next());   // it will print based on the hash code
    }
    Set<Double> set2 = new TreeSet<>();
    set2.add(100.);
    set2.add(200.);
    set2.add(300.);
    set2.add(400.);
    set2.add(400.4);
    Iterator it2 = set2.iterator();
    while (it2.hasNext()) {
        System.out.println(it2.next());
    }
    Set<String > set3 = new TreeSet<>();
    set3.add("dskj");
    set3.add("null;;");
    set3.add("null");
    set3.add("ksdkljkljfkla");
    Iterator it3 = set3.iterator();
    while (it3.hasNext()) {
        System.out.println(it3.next());
    }
    for(String s : set3)
    System.out.println(s);
// Prepare an 3 HashSet Objects and Load Integer,Double and String On Each Object Iterate them using an Iterator
}
}
