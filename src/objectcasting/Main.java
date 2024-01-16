package objectcasting;

public class Main {
    public static void main(String[] args) {
        HeroAgility hero2 = new HeroAgility("Tsunade", 100);
        hero2.display();
        
        //Upcasting
        Hero heroup = (Hero) hero2;
        heroup.display();

        //Downcasting
        HeroAgility hero1 = (HeroAgility) heroup;
        hero1.display();
        
    }
}
