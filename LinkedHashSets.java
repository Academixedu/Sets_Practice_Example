import java.util.*;
public class LinkedHashSets{
// Prepare 3 Linked HashSet Object and Load them With Integer String and Double on Each Object Iterate them by using an Iterator and While Loop
public static void main(String[] args) {
    Set<Integer> set = new LinkedHashSet<Integer>();
    set.add(9);
    set.add(13);
    set.add(9);
    set.add(7);
    set.add(27);
    Iterator<Integer> i = set.iterator();
    while (i.hasNext()) 
    {
        System.out.println(i.next());
    }
    Set<Double> set1 = new LinkedHashSet<Double>();
    set1.add(5.0);
    set1.add(13.0);
    set1.add(7.0);
    set1.add(1.0);
    set1.add(7.0);
    Iterator<Double> d = set1.iterator();
    while (d.hasNext())
    {
        System.out.println(d.next());
    }
    Set<String> set2 = new LinkedHashSet<String>();
    set2.add("Janu");
    set2.add("Madhuri");
    set2.add("Kavya");
    set2.add("sai");
    set2.add("Kavya");
    Iterator<String> s = set2.iterator();
    while (s.hasNext())
    {
        System.out.println(s.next());
    }
}
}
