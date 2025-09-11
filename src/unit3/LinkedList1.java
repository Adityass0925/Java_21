package src.unit3;

import java.util.*;

public class LinkedList1 {
    public static void main(String [] args){
        LinkedList<Integer> l1 =new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements: ");
        Iterator e;
        int input = sc.nextInt();
        for(int i =0;i<input;i++){
            l1.add(sc.nextInt());

        }
        e = l1.iterator();
        while(e.hasNext()){
            System.out.println(e.next());
        }

    }
}
