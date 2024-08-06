
import java.util.HashSet;

public class HashSets{
public static void main(String[]args){
// Prepare an 3 HashSet Objects and Load Integer,Double and String On Each Object Iterate them using an Iterator
 HashSet<Integer> set1 = new HashSet<Integer>();
 HashSet<Double> set2 = new HashSet<Double>();
 HashSet<String> set3 = new HashSet<String>();
 set1.add(1);
 set1.add(2);
 set1.add(3);
 set2.add(5.67);
 set2.add(6.78);    
 set2.add(7.89);
 set3.add("Hello");
 set3.add("World");
 set3.add("Java");
 for (Integer integer : set1) {
     System.out.println(integer);
     
 }
 for (Double d : set2) {
    System.out.println(d);
     
 }
 for(String string : set3) {
     System.out.println(string);
 }
}
}
