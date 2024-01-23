package intrface;

public class Main {
    public static void main(String[] args) {
        HeroPhysical ksatria = new HeroPhysical("Richard", 300, 20, 60, 80);
        HeroPhysical psatir = new HeroPhysical("Michael", 300, 25, 55, 80);
        HeroMagic dukun = new HeroMagic("Rafi", 300, 50, 15, 75);
        ksatria.display();
        dukun.display();
        psatir.display();
        ksatria.attack(dukun);
        dukun.attack(ksatria);
        ksatria.attack(dukun);
        ksatria.attack(dukun);
        ksatria.attack(dukun);
        ksatria.attack(dukun);
    }
}
