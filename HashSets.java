import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSets{
public static void main(String[]args){
    Set<Integer> set1 = new HashSet<Integer>(); 
    set1.add(100000);set1.add(765);set1.add(765);
    set1.add(70);set1.add(400000);set1.add(100000);
    set1.add(2997980);
    Iterator it = set1.iterator(); //output will print according to the values given by the user 
    while (it.hasNext()) {          
        System.out.println(it.next());   
    }
    Set<Double> set2 = new HashSet<>();
    set2.add(100.);
    set2.add(200.);
    set2.add(300.);
    set2.add(400.);
    set2.add(400.4);
    Iterator it2 = set2.iterator();
    while (it2.hasNext()) {
        System.out.println(it2.next());
    }
    Set<String > set3 = new HashSet<>();
    set3.add("dskj");
    set3.add("null;;");
    set3.add(null);
    set3.add("ksdkljkljfkla");
    for(String i:set3)
    System.out.println(i);
// Prepare an 3 HashSet Objects and Load Integer,Double and String On Each Object Iterate them using an Iterator
}
}
