package gun;

import java.util.*;

public class game {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        senjata dor = new senjata();
        Target musuh = new Target();
        dor.setNama("AK47");
        dor.setBullet(30);
        musuh.setHP(100);
        System.out.println("Nama Senjata\t: " + dor.getNama() + "\nJumlah Peluru\t: " + dor.getBullet());

        while (true) {
            String com = s.nextLine();
            switch (com) {
                case ("r"):
                    dor.reload();
                    break;
                case ("e"):
                    dor.tembak(musuh);
                    break;
                case ("auto"):
                    while (!musuh.mati()) {
                        dor.tembak(musuh);
                        if(dor.getBullet() < 0){
                         dor.reload();   
                        }
                    }
                    break;
            }
            if (dor.getBullet() <= 0) {
                System.out.println("Peluru anda habis, anda kalah ");
                System.exit(0);
                s.close();
            }
            if (musuh.mati()) {
                System.out.println("\nJumlah Peluru yang kena target : " + musuh.getHit());
                System.out.println("Victory");
                System.exit(0);
            }

        }
    }
}
