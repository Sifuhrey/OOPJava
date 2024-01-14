package SubclassConstructor;

public class Main {
    public static void main(String[] args) {
        HeroStrength hero2 = new HeroStrength("Naruto",50);
        hero2.display();
        Hero hero1 = new Hero("Sasuke",45);
        hero1.display();
        Hero hero3 = new Hero("Sakura");
        hero3.display();
    }
}
