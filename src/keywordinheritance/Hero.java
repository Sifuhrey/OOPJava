package keywordinheritance;

import java.util.Scanner;

public class Hero {
    Scanner s = new Scanner(System.in);
    protected String name;
    protected int HP;

    Hero() {
        System.out.print("Masukkan nama: ");
        this.name = s.nextLine();
    }

    public void setHP() {
        System.out.print("Masukkan HP: ");
        this.HP = s.nextInt();
    }

    void display() {
        System.out.println("Nama\t: " + this.name);
        System.out.println("HP\t: " + this.HP);
    }
}
