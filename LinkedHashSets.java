import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSets{

    public static void main(String[] args){
// Prepare 3 Linked HashSet Object and Load them With Integer String and Double on Each Object Iterate them by using an Iterator and While Loop

       //For Integer

       Set<Integer> s = new LinkedHashSet<Integer>();

       s.add(23);
       s.add(27);
       s.add(53);
       s.add(43);

       Iterator ss = s.iterator();

       while(ss.hasNext()){

        System.out.println(ss.next());
       }

       //For double

       Set<Double> d = new LinkedHashSet<Double>();

       d.add(20.9);
       d.add(44.23);
       d.add(77.56);
       d.add(49.48);

       Iterator dd = d.iterator();

       while(dd.hasNext()){

        System.out.println(dd.next());
       }

       //For String

       Set<String> str = new LinkedHashSet<String>();

       str.add("ghs");
       str.add("dshgs");
       str.add("dghsd");
       str.add("hjdgshd");

       Iterator strs = str.iterator();

       while(strs.hasNext()){

        System.out.println(strs.next());
       }

}
}
