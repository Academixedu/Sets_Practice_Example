import java.util.HashSet;
import java.util.Set;
public class HashSets{
public static void main(String[]args){
    Set<Integer> set1 = new HashSet<Integer>();
    
   
    set1.add(1);
    set1.add(2);
    set1.add(3);

    Set<Double> set2 = new HashSet<Double>();

    set2.add(2.7);
    set2.add(2.8);
    set2.add(2.9);

    Set<String> set3 = new HashSet<String>();

    set3.add("Hello");
    set3.add("World");
    set3.add("Java");

    for(int i:set1){
        System.out.println(i);
    }
    for(Double i:set2){
        System.out.println(i);
    }
    for(String i:set3){
        System.out.println(i);
    }




}
}
