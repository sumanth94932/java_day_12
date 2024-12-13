import java.util.*;
class linkedlistmethod1{
    public static void main(String args[]){
        LinkedList<Integer> a=new LinkedList<>();
        a.add(567);
        a.add(789);
        a.add(900);
        System.out.println(a);
        a.addFirst(89);
        System.out.println(a);
        a.addLast(90);
        System.out.println(a);
    }
}/*   5
4 8 9 6 2 
[2, 6, 9, 8, 4]  */