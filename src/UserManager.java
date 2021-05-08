public class UserManager {
    public void add(User user) {
        System.out.println("Kullanici eklendi " + user.getEmail());
    }

    public void update(User user) {
        System.out.println("Kullanici guncellendi " + user.getEmail());
    }

    public void delete(User user) {
        System.out.println("Kullanici silindi " + user.getEmail());
    }
}
