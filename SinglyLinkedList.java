class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    private Node head;
    private int size;

    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    // 1. insertFirst
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // 2. insertLast
    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // 3. deleteFirst
    public void deleteFirst() {
        if (head != null) {
            head = head.next;
            size--;
        }
    }

    // 4. deleteLast
    public void deleteLast() {
        if (head == null)
            return;
        if (head.next == null) {
            head = null;
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
        size--;
    }

    // 5. find
    public Node find(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // 6. display
    public void display() {
        Node current = head;
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // 7. size
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        SinglyLinkedList List = new SinglyLinkedList();

        // insert elements(first and last)
        System.out.println("Addition of elements");
        List.insertFirst(83);
        List.insertLast(45);
        List.insertFirst(6);
        List.insertLast(17);
        List.insertFirst(67);
        List.insertLast(98);
        List.display();

        // delete elements(first and last)
        System.out.println("\nDeletion of  1st and last elements");
        List.deleteFirst();
        List.deleteLast();
        List.display();

        // find specific element and display
        System.out.println("\nFind element");
        Node f = List.find(17);
        System.out.println("Found Node " + (f != null ? f.data : "Not found"));

        // test size
        System.out.println("\nSize of List: " + List.size());
        List.display();

        List.deleteFirst();
        System.out.println("\nSize after 1 deletion :" + List.size());
        List.display();

        List.insertFirst(1);
        List.insertLast(2);
        System.out.println("\nSize after 2 insertions :" + List.size());

        List.display();

    }
}
