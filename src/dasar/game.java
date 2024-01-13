package dasar;

public class game {
    public static void main(String[] args) {
        player petani = new player();
        petani.nama = "petani ganja ";
        petani.speed = 78;
        petani.hp = 0;
        petani.run();

        if (petani.mati()){
            System.out.println("game over");
            
        }
    }
}
