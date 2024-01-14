package latihaninheritance;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Saitama", 100, 10);
        HeroStrength hero2 = new HeroStrength("Garou", 90, 20);

        hero1.display();
        hero2.display();
        hero1.attack(hero2);
        hero2.attack(hero1);

    }
}
