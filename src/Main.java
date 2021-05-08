public class Main {

    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        StudentManager studentManager = new StudentManager();
        InstructorManager instructorManager = new InstructorManager();

        User user1 = new User(1, "john@example.com");
        User user2 = new User(2, "jane@example.com");
        User user3 = new User(3, "rick@example.com");

        Student student1 = new Student(1, 1, "John", "Doe");
        Student student2 = new Student(2, 2, "Jane", "Doe");

        Instructor instructor1 = new Instructor(1, 3, "Rick", "Roe");

        userManager.add(user1);
        userManager.add(user2);
        userManager.add(user3);

        System.out.println("------------------------------");

        studentManager.add(student1);
        studentManager.add(student2);

        System.out.println("------------------------------");

        instructorManager.add(instructor1);

        System.out.println("------------------------------");

        student2.setLastName("Doe II");
        studentManager.update(student2);

        System.out.println("------------------------------");

        studentManager.delete(student1);

        System.out.println("------------------------------");

        instructor1.setFirstName("Richard");
        instructorManager.update(instructor1);
    }
}
