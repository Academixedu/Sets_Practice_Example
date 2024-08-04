import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Iterator;
public class LinkedHashSets{

public static void main(String[]args){
    Set<Integer> a=new  LinkedHashSet<Integer>();
    a.add(1);
    a.add(2);
    a.add(3);
    Iterator i=a.iterator();
    while(i.hasNext()){
        System.out.println(i.next());
    }

    Set<Double> b=new  LinkedHashSet<Double>();  
    b.add(9.25);
    b.add(10.25);
    b.add(2.5);
    Iterator j=b.iterator();
    while(j.hasNext()){
        System.out.println(j.next());
    }
    Set<String> c=new  LinkedHashSet<String>();
    c.add("Hello");
    c.add("World");
    Iterator n=c.iterator();
    while(n.hasNext()){
        System.out.println(n.next());
    }   
}

    


// Prepare 3 Linked HashSet Object and Load them With Integer String and Double on Each Object Iterate them by using an Iterator and While Loop
}
