package Overloading;

public class Player {
    private String name;
    private static int jumlah;

    Player(String name){
        this.name = name;
        Player.jumlah++;
    }
    Player(){
        Player.jumlah++;
        this.name = "Player"+Player.jumlah;
    }

    String getName(){
        return this.name;
    } 
}
