import java.util.LinkedHashSet;
import java.util.Set;
public class LinkedHashSets{
public static void main(String[]args){
// Prepare 3 Linked HashSet Object and Load them With Integer String and Double on Each Object Iterate them by using an Iterator and While Loop
Set<Integer> set = new LinkedHashSet<Integer>();
set.add(10);
set.add(20);
Set<Double> set1 = new LinkedHashSet<Double>();
set1.add(123.235);
set1.add(256.352);
Set<String> set2 = new LinkedHashSet<String>();
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
