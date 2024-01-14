package overriding;

public class HeroStrength extends Hero {
    int DEF;
    void display(){
        System.out.println("\nHero Strength");
        System.out.println("Nama\t: "+this.name);
        System.out.println("DEF \t: "+this.DEF);
    }
}
