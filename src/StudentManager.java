public class StudentManager {
    public void add(Student student) {
        System.out.println("Ogrenci eklendi " + student.getFirstName() + " " + student.getLastName());
    }

    public void update(Student student) {
        System.out.println("Ogrenci guncellendi " + student.getFirstName() + " " + student.getLastName());
    }

    public void delete(Student student) {
        System.out.println("Ogrenci silindi " + student.getFirstName() + " " + student.getLastName());
    }
}
