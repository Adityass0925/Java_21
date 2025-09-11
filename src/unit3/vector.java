package src.unit3;

import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>(5,3);
        v.add("First");
        v.add("Second");
        v.add("First");
        v.add("Second");
        v.add("First");
        v.add("Second");
        v.add(4,"fourth");
        System.out.println(v.capacity());
        System.out.println(v.size());
    }
}
