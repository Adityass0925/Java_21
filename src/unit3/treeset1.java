import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class treeset1 {
    public static void main(String[] args) {
        SortedSet<Integer> ts = new TreeSet<>();   // use ts consistently
        System.out.println("Enter the number of elements:");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            ts.add(sc.nextInt());   // add elements to TreeSet
        }

        System.out.println("TreeSet: " + ts);
        System.out.println("Subset(2,5): " + ts.subSet(2, 5));  // 2 inclusive, 5 exclusive
        System.out.println("Contains 5? " + ts.contains(5));

        sc.close();
    }
}