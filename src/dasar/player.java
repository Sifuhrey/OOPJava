package dasar;

public class player {
    String nama;
    int speed;
    int hp;
    void run(){
        System.out.println(nama+"sedang lari");
        System.out.println("kecepatan: "+ speed);
       
    }
    boolean mati(){
        if (hp <= 0) return true;
        return false;
    }
}
