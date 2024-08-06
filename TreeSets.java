import java.util.TreeSet;

public class TreeSets{
public static void main(String[]args){
// Prepare an 3 TreeSet Objects and Load Integer,Double and String On Each Object Iterate them using an Iterator

TreeSet<Integer> set1 = new TreeSet<Integer>();
TreeSet<Double> set2 = new TreeSet<Double>();
TreeSet<String> set3 = new TreeSet<String>();

set1.add(5);
set1.add(2);    
set1.add(4);
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
for (String string : set3) {
    System.out.println(string);
}

}
}
