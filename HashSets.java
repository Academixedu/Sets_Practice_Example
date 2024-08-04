import java.util.HashSet;
import java.util.Set;
public class HashSets{
public static void main(String[]args){
// Prepare an 3 HashSet Objects and Load Integer,Double and String On Each Object Iterate them using an Iterator
Set<Integer> set = new HashSet<Integer>();
set.add(10);
set.add(20);
Set<Double> set1 = new HashSet<Double>();
set1.add(123.235);
set1.add(440.235);
Set<String> set2 = new HashSet<String>();
set2.add("Kumar");
set2.add("Lucky");
for(Integer i:set){
System.out.println(i);
}
for(Double j:set1){
System.out.println(j);
}
for(String k:set2){
System.out.println(k);
}
}
}
