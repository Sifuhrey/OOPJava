package login;

import java.io.*;
import java.util.Arrays;

public class User {
    private String username;
    private char[] password;

    Console c = System.console();

    public User(String proses) {
        System.out.println("\n"+proses);
        System.out.print("Masukkan Username: ");
        this.username = c.readLine();
        System.out.print("Masukkan Password: ");
        this.password = c.readPassword();

    }

    @Override
    public boolean equals(Object otherObject) {
    if (this == otherObject) {
        return true;
    } else if (otherObject instanceof User) {
        User other = (User) otherObject;
        return this.username.equals(other.username) && Arrays.equals(this.password, other.password);
    } else {
        return false;
    }
}

    public void display(User other) {
        String print = (this.equals(other)) ? "\nAnda Berhasil Login" : "\nAnda Gagal Login";
        System.out.println(print);
    }

}
