import java.util.*;
class hashmap2{
    public static void main(String [] args){
        HashMap<String,String> a=new HashMap<>();
         a.put("sno","53");
        a.put("sname","RS");
        if(a.containsKey("sname"))
        {
            String d=a.get("sname");
            System.out.println(d);
        }
    }
}/*  RS  */