import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSets{
public static void main(String[]args){
// Prepare an 3 HashSet Objects and Load Integer,Double and String On Each Object Iterate them using an Iterator
Set<Integer> list = new HashSet<Integer>();
list.add(10);
list.add(20);
list.add(30);
Iterator<Integer> itr = list.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}

Set<Double> list1 = new HashSet<Double>();
list1.add(1.0);
list1.add(2.0);
list1.add(3.0);
Iterator<Double> itr1 = list1.iterator();
while(itr1.hasNext()){
System.out.println(itr1.next());
}
Set<String> list2 = new HashSet<String>();
list2.add("a");
list2.add("b");
list2.add("c");
Iterator<String> itr2 = list2.iterator();
while(itr2.hasNext()){
System.out.println(itr2.next());
}
}
}
