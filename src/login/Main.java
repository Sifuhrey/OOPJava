package login;

public class Main {
    public static void main(String[] args) {
        User signUp = new User("Buat Akun");
        User login = new User("Masuk Akun");
        signUp.display(login);
    }
}
