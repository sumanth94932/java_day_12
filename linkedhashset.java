import java.util.*;
public class linkedhashset{
    public static void main(String args[]){
        //hash set operations
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("HELLo");
        a.add("HELLo");
        a.add("students");
        a.add("rajesh");
        a.add("students");
        System.out.println(a);
        a.remove("rajesh");
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}/* [HELLo, students, rajesh]
[HELLo, students]
[] */