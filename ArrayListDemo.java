import java.util.ArrayList;
import java.util.Collections;


public class ArrayListDemo {
    public static void main(String[] args) {
        // Arraylist only stores object as it is formed inside heap
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list1 = new ArrayList<>();
        // to add element in arraylist we use .add()
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        // if we use .add method ,elements are inserted from back
        System.out.println(list);

        int ele = list.get(1); // getting a specific element
        System.out.println(ele);

        list.add(2, 50); // inserting element in between
        System.out.println(list);
        
        // setting or changing element
        list.set(1,0);
        System.out.println(list);
        
        // deletion of element from list
        list.remove(2);
        System.out.println(list);

        // Size of list
        int size = list.size();
        System.out.println(size);

        list.add(2, 14); 
        list.add(1, 4); 
        list.add(3, 1); 
        
        // Sorting can be done automatically in ascending order using collection.sort(list) in Arraylist

        Collections.sort(list);
        System.out.println(list);

    }

}