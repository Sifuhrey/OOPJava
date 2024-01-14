package overriding;

public class Main {
    public static void main(String[] args) {
        HeroStrength hero2 = new HeroStrength();
        hero2.DEF = 34;
        hero2.name = "Kakashi";
        hero2.display();

        Hero hero1 = new Hero();
        hero1.name = "Madara";
        hero1.display();
    }
}
