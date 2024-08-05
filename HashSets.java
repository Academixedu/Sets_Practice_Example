import java.util.*;
public class HashSets{
public static void main(String[]args){
// Prepare an 3 HashSet Objects and Load Integer,Double and String On Each Object Iterate them using an Iterator
Set<Integer> set = new HashSet<Integer>();
set.add(9);
set.add(7);
set.add(9);
set.add(10);
set.add(15);
Iterator<Integer> i = set.iterator();
while(i.hasNext()){
System.out.println(i.next());
}
Set<Double> set1 = new HashSet<Double>();
set1.add(19.0);
set1.add(14.0);
set1.add(25.0);
set1.add(23.0);
set1.add(25.0);
Iterator<Double> d = set1.iterator();
while(d.hasNext()){
System.out.println(d.next());
}
Set<String> set2 = new HashSet<String>();
set2.add("Janu");
set2.add("Madhuri");
set2.add("Janu");
set2.add("sai");
set2.add("Kavya");
Iterator<String> s = set2.iterator();
while(s.hasNext()){
System.out.println(s.next());
}
}
}