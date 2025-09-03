package src.unit3;

import java.util.*;

public class Arraylist {
    public static void main(String [] args){
        ArrayList<String> al = new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            al.add(sc.next());
        }

        Iterator j = al.iterator();
        while(j.hasNext()){
            System.out.print(j.next()+" ");
        }
        System.out.println();
        Collections.sort(al);
        System.out.println(al);
    }
}
