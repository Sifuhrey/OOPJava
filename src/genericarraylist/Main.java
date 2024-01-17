package genericarraylist;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Sampoerna", 100);
        Hero hero2 = new Hero("Djarum", 90);
        Agilityhero hero3 = new Agilityhero("Juara", 110);
        Intelhero hero4 = new Intelhero("Gudang Garam", 50);

        Hero[] herogroup = new Hero[3];
        herogroup[0] = hero1;
        herogroup[1] = hero2;
        herogroup[2] = hero3;

        for(Hero pahlawan : herogroup){
            pahlawan.display();
        }

        ArrayList<Hero> daftarhero = new ArrayList<>();
        daftarhero.add(hero1);
        daftarhero.add(hero2);
        daftarhero.add(hero3);
        daftarhero.add(hero4);

        for(Hero pahlawan : daftarhero){
            pahlawan.display();
        }
        
        hero3.setName("Jarwo");
        daftarhero.remove(hero4);
        
        for(Hero pahlawan : daftarhero){
            pahlawan.display();
        }
    }
}
