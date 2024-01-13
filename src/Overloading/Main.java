package Overloading;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Ujang");
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player("Tahubulat");
        System.out.println(player1.getName());
        System.out.println(player2.getName());
        System.out.println(player3.getName());
        System.out.println(player4.getName());

    }
}
