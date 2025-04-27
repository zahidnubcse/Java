
import java.util.Scanner;

class Student {

    String name;
    int id;
    float cgpa;

    public Student(String name, int id, float cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    void studentDetails() {
        System.out.println("Name: " + name);
        System.out.println("\nID: " + id);
        System.out.println("\nCGPA: " + cgpa);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name:");
        String name = scanner.nextLine();
        

        System.out.println("Enter ID:");
        int id = scanner.nextInt();
        

        System.out.println("Enter CGPA:");
        float cgpa = scanner.nextFloat();
        

        Student std1 = new Student(name, id, cgpa);
        System.out.println("Here is Student Details: ");
        std1.studentDetails();
    }
}
