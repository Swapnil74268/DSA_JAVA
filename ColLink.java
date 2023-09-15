import java.util.*;
public class ColLink 
{
    public static void main(String[] args) 
    {
       LinkedList<Integer> list = new LinkedList<>();
       list.addFirst(45);
       list.addFirst(25);
       System.out.println(list);
       list.addLast(58); 
       System.out.println(list);
    }
}
