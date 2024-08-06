import java.util.LinkedHashSet;
import java.util.Set;
public class LinkedHashSets{
// Prepare 3 Linked HashSet Object and Load them With Integer String and Double on Each Object Iterate them by using an Iterator and While Loop
public static void main(String[] args) {
    
    Set<Integer> set = new LinkedHashSet<Integer>();
    Set<Double> set1 = new LinkedHashSet<Double>();
    Set<String> set2 = new LinkedHashSet<String>();
   
    set.add(1);
    set.add(2);
    set.add(3);
    set1.add(5.67);
    set1.add(6.78);
    set1.add(7.89);
    set2.add("Hello");
    set2.add("World");
    set2.add("Java");
   
    for (Integer integer : set) {
        System.out.println(integer);
    }
    for (String string : set2) {
        System.out.println(string);
    }
    for (Double d : set1) {
        System.out.println(d);
    }
}
}
