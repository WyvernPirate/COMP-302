import java.util.Set;
import java.util.TreeSet;

public class Maps {
    public static void main(String[] args) {

        // Create a TreeSet to store unique elements in sorted order
        Set<Integer> s = new TreeSet<>();

        // Add elements to the set
        s.add(3);
        s.add(34);
        s.add(3);
        s.add(23);
        s.add(34);
        s.add(9);

        // Print the unique elements in sorted order 
        System.out.println("Unique elements in sorted order: " + s);

    }
}