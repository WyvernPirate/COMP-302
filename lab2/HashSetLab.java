import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetLab {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        // input from user(10 numbers)
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            int num = sc.nextInt();
            set.add(num);
        }

        // display the hashset
        System.out.println("\nHashSet: " + set);

        // add a num to the hashset and scheck if it exists
        System.out.print("\nEnter another number to check if it's already in the set: ");
        int checkNum = sc.nextInt();

        if (set.contains(checkNum)) {
            System.out.println(checkNum + " is already in the set.");
        } else {
            System.out.println(checkNum + " is NOT in the set.");
        }
        sc.close();
    }
}
