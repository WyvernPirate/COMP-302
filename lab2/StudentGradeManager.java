import java.util.HashMap;
import java.util.Map;

public class StudentGradeManager {

    Map<String, Integer> map = new HashMap<>();

    // adding students and marks
    public void addStudent(String name, int grade) {
        map.put(name, grade);

    }

    // removing students and marks
    public void removeStudent(String name) {
        map.remove(name);
    }

    // get a grade for student
    public int getGrade(String name) {
        return map.get(name);
    }

    // prints all students
    public void printAllStudents() {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        StudentGradeManager manager = new StudentGradeManager();

        // add 5 students
        manager.addStudent("John", 90);
        manager.addStudent("Alice", 85);
        manager.addStudent("Bob", 95);
        manager.addStudent("Charlie", 80);
        manager.addStudent("David", 92);
        System.out.println("All the students:");
        manager.printAllStudents();

        // remove one student
        manager.removeStudent("Alice");
        System.out.println("\nAfter removing Alice:");
        manager.printAllStudents();

        // retrive John's marks
        System.out.println("\nJohn's marks: " + manager.getGrade("John"));

        // print all students
        System.out.println("\nAll the students:");
        manager.printAllStudents();
    }

}
