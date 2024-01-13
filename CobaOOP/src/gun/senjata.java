package gun;

import java.util.Random;

class senjata {
    Random r = new Random();
    private String nama;
    private int bullet;
    

    public void setNama(String nama){
        this.nama = nama;
    }
    public void setBullet(int bullet){
        this.bullet = bullet;
    }
    public String getNama(){
        return this.nama;
    }
    public int getBullet(){
        return this.bullet;
    }

    void tembak(Target opp){
        System.out.println("\nmenembak");
        bullet--;
        System.out.println("Sisa peluru : "+bullet);
        opp.setChance(r.nextInt(10));
        opp.kena();
    }
    void reload(){
        bullet = 30;
        System.out.println("\nPeluru anda terisi kembali");
    }
    
}
