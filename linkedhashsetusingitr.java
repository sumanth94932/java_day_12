import java.util.*;
public class linkedhashsetusingitr{
    public static void main(String args[]){
        // printing hash set
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("HELLo");
        a.add("HELLo");
        a.add("students");
        a.add("rajesh");
        a.add("students");
        Iterator itr=a.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()+" ");
        }
    }
}/*      HELLo 
         students 
         rajesh    */