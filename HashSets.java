import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSets{
public static void main(String[]args){
// Prepare an 3 HashSet Objects and Load Integer,Double and String On Each Object Iterate them using an Iterator

             //For Integer

         Set<Integer> s = new HashSet<Integer>();

         s.add(10);
         s.add(5);
         s.add(16);
         s.add(29);

         Iterator<Integer> ss = s.iterator();

         while(ss.hasNext()){

            System.out.println(ss.next());
        }

             //For Double

         Set<Double> d = new HashSet<Double>();

         d.add(20.6);
         d.add(17.6);
         d.add(63.00);
         d.add(56.8);

         Iterator<Double> dd = d.iterator();

         while(dd.hasNext()){

            System.out.println(dd.next());
         }

         //For String

         Set<String> str = new HashSet<String>();

         str.add("abc");
         str.add("xyz");
         str.add("pqr");
         str.add("stu");

         Iterator<String> strs = str.iterator();

         while(strs.hasNext()){

            System.out.println(strs.next());
         }
}
}
