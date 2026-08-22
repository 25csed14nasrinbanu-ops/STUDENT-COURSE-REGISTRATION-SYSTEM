import java.util.ArrayList;
import java.util.Scanner;

class Course {
    String code;
    String title;
    String description;
    int capacity;
    String schedule;

    Course(String code, String title, String description,
           int capacity, String schedule) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.schedule = schedule;
    }

    void display() {
        System.out.println("\nCourse Code: " + code);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Available Slots: " + capacity);
        System.out.println("Schedule: " + schedule);
    }
}

class Student {
    int id;
    String name;
    ArrayList<Course> registeredCourses = new ArrayList<>();

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void registerCourse(Course course) {
        if (registeredCourses.contains(course)) {
            System.out.println("You have already registered for this course.");
        } else if (course.capacity > 0) {
            registeredCourses.add(course);
            course.capacity--;
            System.out.println("Course registered successfully!");
        } else {
            System.out.println("Course is full!");
        }
    }

    void dropCourse(String code) {
        for (int i = 0; i < registeredCourses.size(); i++) {
            Course course = registeredCourses.get(i);

            if (course.code.equalsIgnoreCase(code)) {
                registeredCourses.remove(i);
                course.capacity++;
                System.out.println("Course dropped successfully!");
                return;
            }
        }

        System.out.println("You are not registered for this course.");
    }

    void viewRegisteredCourses() {
        if (registeredCourses.isEmpty()) {
            System.out.println("\nNo courses registered.");
        } else {
            System.out.println("\n----- REGISTERED COURSES -----");

            for (Course course : registeredCourses) {
                System.out.println(course.code + " - " + course.title);
            }
        }
    }
}

public class StudentCourseRegistration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Course> courses = new ArrayList<>();

        courses.add(new Course(
                "CS101",
                "Java Programming",
                "Introduction to Java programming",
                3,
                "Monday - 10:00 AM"));

        courses.add(new Course(
                "CS102",
                "Data Structures",
                "Learn basic data structures",
                2,
                "Wednesday - 2:00 PM"));

        courses.add(new Course(
                "CS103",
                "Operating Systems",
                "Learn operating system concepts",
                2,
                "Friday - 11:00 AM"));

        System.out.println("===== STUDENT COURSE REGISTRATION SYSTEM =====");

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        Student student = new Student(id, name);

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Display Available Courses");
            System.out.println("2. Register for a Course");
            System.out.println("3. Drop a Course");
            System.out.println("4. View Registered Courses");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("\n----- AVAILABLE COURSES -----");

                    for (Course course : courses) {
                        course.display();
                    }
                    break;

                case 2:
                    System.out.print("Enter Course Code to Register: ");
                    String registerCode = sc.nextLine();

                    boolean found = false;

                    for (Course course : courses) {
                        if (course.code.equalsIgnoreCase(registerCode)) {
                            student.registerCourse(course);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Invalid Course Code!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Course Code to Drop: ");
                    String dropCode = sc.nextLine();
                    student.dropCourse(dropCode);
                    break;

                case 4:
                    student.viewRegisteredCourses();
                    break;

                case 5:
                    System.out.println("Thank you for using the system!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}