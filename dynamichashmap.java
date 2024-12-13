import java.util.*;
public class dynamichashmap{
    public static void main(String args[]){
        HashMap<String,String> a=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String s=sc.next();
            String s1=sc.next();
            a.put(s,s1);
        }
        System.out.println(a);
        //usong for each
        for(String s:a.keySet()){
            System.out.println(s+":"+a.get(s));
        }
    }
}/*


4
sk sr ak sv jv pk
mk
mp
{sk=sr, ak=sv, jv=pk, mk=mp}
sk:sr
ak:sv
jv:pk
mk:mp   */