import java.util.PriorityQueue;

public class Customer implements Comparable<Customer> {

    public String name;
    public int priority;

    public Customer(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Customer other) {
        return Integer.compare(this.priority, other.priority);
    }

}

class CustomerSupportQueue {
    public PriorityQueue<Customer> queue = new PriorityQueue<>();

    // method to add a customer
    public void addCustomer(String name, int priority) {
        queue.add(new Customer(name, priority));
    }

    // method to server customers
    public void serveCustomer() {
        if (!queue.isEmpty()) {
            Customer serve = queue.poll(); // remove highest priority customer
            System.out.println("\nServing: " + serve.name);
        } else {
            System.out.println("No customers in the queue");
        }
    }

    // method to display queue
    public void printQueue() {
        System.out.println("Queue: ");
        for (Customer customer : queue) {
            System.out.println(customer.name + " - " + customer.priority);
        }
    }
}

class Tester {
    public static void main(String[] args) {
        CustomerSupportQueue queue = new CustomerSupportQueue();

        // add 5 customers
        queue.addCustomer("John", 3);
        queue.addCustomer("Alice", 1);
        queue.addCustomer("Bob", 2);
        queue.addCustomer("Charlie", 4);
        queue.addCustomer("David", 5);

        // print initial queue
        System.out.println("\nInitial Queue");
        queue.printQueue();

        // serve two customers
        queue.serveCustomer();
        System.out.println("\nQueue after serving 1 customer");
        queue.printQueue();

        // serve second customer
        queue.serveCustomer();

        // print queue after serving customers
        System.out.println("\nQueue after serving 2 customers");
        queue.printQueue();
    }

}
