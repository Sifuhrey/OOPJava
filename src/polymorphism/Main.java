package polymorphism;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Gojo");
        Hero hero2 = new HeroStrength("Yuji");
        Hero hero3 = new HeroIntel("Megumi");
        Hero hero4 = new HeroAgility("Yuta");
       
        hero1.display();
        hero2.display();
        hero3.display();
        hero4.display();
      
        
    }
}
