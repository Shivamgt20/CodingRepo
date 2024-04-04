package com.shivam;
import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        

        /*  Focus on ArrayList 

            Cover functions --> Module (helps me in doing questions more efficiently)

            searrching and sorting
            Kadances algo
            Sliding window --> variable and fixed
            2 Pointers approach
        */ 

        ArrayList<Integer> list = new ArrayList<>();
        // add() --> adds an element at the end of the list.
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);

        // System.out.println(list.size());
        // System.out.println(list.get(1));

        list.add(0, 9999);
        System.out.println(list);
        int[] arr = new int[list.size()];
        Object[] obj = list.toArray();
        System.out.println(obj[3]);

     list.remove(2);
     System.out.println(list);
     System.out.println(list.contains(30));

     System.out.println(list.indexOf(50));

     Collections.sort(list);

     System.out.println(list);
    }
}
