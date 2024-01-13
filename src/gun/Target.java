package gun;

import java.util.*;

class Target {
    Random acak = new Random();
    private int hp, chance, hit = 0;

    public void setHP(int hp){
        this.hp = hp;
    }
    public void setChance(int chance){
        this.chance = chance;
    }
    boolean mati() {
        if (hp <= 0) {
            hp = 0;
            return true;
        }
        return false;
    }

    void kena() {
        if (chance % 4 == 0) {
            int hit = acak.nextInt(24);
            hp -= hit;
            setHit();
        }
        System.out.println("Sisa HP target adalah: " + hp);
    }
    private void setHit(){
        this.hit++;
    }
    int getHit(){
        return this.hit;
    }
}
