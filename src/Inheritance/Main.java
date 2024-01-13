package Inheritance;

class Hero {
    String name;
}

class HeroStrength extends Hero {

}

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "Gojo";
        System.out.println(hero1.name);

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Sukuna";
        System.out.println(hero2.name);
    }
}
