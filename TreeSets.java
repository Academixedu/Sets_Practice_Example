import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSets{
public static void main(String[]args){
// Prepare an 3 TreeSet Objects and Load Integer,Double and String On Each Object Iterate them using an Iterator


      Set<Integer> s = new TreeSet<Integer>();

      s.add(10);
      s.add(25);
      s.add(29);
      s.add(83);

      Iterator<Integer> ss = s.iterator();

      while(ss.hasNext()){

        System.out.println(ss.next());
      }

      //For Double

      Set<Double> d = new TreeSet<Double>();

      d.add(51.3);
      d.add(538.00);
      d.add(656.25);
      d.add(253.02);

      Iterator<Double>dd = d.iterator();

      while(dd.hasNext()){
        
        System.out.println(dd.next());
      }

      //For String

      TreeSet<String> str = new TreeSet<String>();

      str.add("gfd");
      str.add("ghc");
      str.add("bxc");
      str.add("zbx");

      Iterator<String> strs = str.iterator();

      while(strs.hasNext()){

        System.out.println(strs.next());
      }


}
}
