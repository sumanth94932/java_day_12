import java.util.*;
public class linkedlistclone{
    public static void main(String args[]){
        LinkedList<Integer> a=new LinkedList<>();
        //cloning in linkedlists
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        for(int i=0;i<size;i++){
            int s=sc.nextInt();
            a.addFirst(s);
        }
        LinkedList<Integer> b=new LinkedList<>();
        b=(LinkedList)a.clone();
        System.out.println(b); 
    }
}/*    
5
3
8
9
3
2
[2, 3, 9, 8, 3]  */