import java.util.Collections;
import java.util.LinkedList;

public class LinkedListLab {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        // inserting elements at beginning and end
        list.addFirst("Phemelo");
        list.addLast("Mpho");
        list.addFirst("Tony");
        list.addLast("Lame");
        list.addFirst("Bame");
        list.addLast("Salim");
        System.out.println("Linked List: " + list);

        // remove elements at the beginning and end
        list.removeFirst();
        list.removeLast();
        System.out.println("\nLinked List: " + list);

        // accessing elements by index
        System.out.println("\nElement at index 0: " + list.get(0));
        System.out.println("Element at index 1: " + list.get(1));

        // check if element exists
        System.out.println("\nDoes list contain 'Mpho'? " + list.contains("Mpho"));
        System.out.println("Does list contain 'Donnel'? " + list.contains("Donnel"));

        // display elements using a loop
        System.out.println("\nLinked List: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at i" + i + ": " + list.get(i));
        }

        // reverse the list and display
        System.out.println("\nNormal Linked List: " + list);
        Collections.reverse(list);
        System.out.println("Reversed Linked List: " + list);

    }

}
