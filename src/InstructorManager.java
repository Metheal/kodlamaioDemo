public class InstructorManager {
    public void add(Instructor instructor) {
        System.out.println("Egitmen eklendi " + instructor.getFirstName() + " " + instructor.getLastName());
    }

    public void update(Instructor instructor) {
        System.out.println("Egitmen guncellendi " + instructor.getFirstName() + " " + instructor.getLastName());
    }

    public void remove(Instructor instructor) {
        System.out.println("Egitmen silindi " + instructor.getFirstName() + " " + instructor.getLastName());
    }
}
