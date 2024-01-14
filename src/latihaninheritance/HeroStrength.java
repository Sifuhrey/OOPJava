package latihaninheritance;

public class HeroStrength extends Hero{
    String type = "Strength";
    HeroStrength(String name, double HP, double ATK){
        super(name,HP,ATK);
    }
    @Override
    void display(){
        System.out.println("\nTipe Hero: "+this.type);
        super.display();
    }

    @Override
    void takeDMG(double DMG){
        System.out.println(this.name+" receive half damage : "+DMG+" damage -> "+0.5*DMG+" damage");
        this.HP -= 0.5*DMG;
        this.display();
    }
}   
