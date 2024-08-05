import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Iterator;

public class LinkedHashSets{
// Prepare 3 Linked HashSet Object and Load them With Integer String and Double on Each Object Iterate them by using an Iterator and While Loop
//For Integer

public static void main(String[] args){
           //For Integer
    
           Set<Integer> s = new LinkedHashSet<Integer>();
    
           s.add(10);
           s.add(27);
           s.add(50);
           s.add(43);
    
           Iterator ss = s.iterator();
    
           while(ss.hasNext()){
    
            System.out.println(ss.next());
           }
    
           //For double
    
           Set<Double> d = new LinkedHashSet<Double>();
    
           d.add(20.0);
           d.add(45.23);
           d.add(75.57);
           d.add(49.45);
    
           Iterator dd = d.iterator();
    
           while(dd.hasNext()){
    
            System.out.println(dd.next());
           }
    
           //For String
    
           Set<String> str = new LinkedHashSet<String>();
    
           str.add("Jahnavi");
           str.add("shanmukh");
           str.add("mahathi");
           str.add("disha");
    
           Iterator strs = str.iterator();
    
           while(strs.hasNext()){
    
            System.out.println(strs.next());
           }
    
    }
    }