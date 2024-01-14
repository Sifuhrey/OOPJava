package latihaninheritance;

public class Hero {
    String name;
    double HP, ATK;
    Hero(String name, double HP, double ATK){
        this.name = name;
        this.ATK = ATK;
        this.HP = HP;
    }
    void attack(Hero enemy){
        System.out.println("\n"+this.name+" is attacking "+enemy.name);
        enemy.takeDMG(this.ATK);
    }
    void takeDMG(double DMG){
        System.out.println(this.name+" receive "+DMG+" damage");
        this.HP -= DMG;
        this.display();
    }
    void display(){
        System.out.println("Nama\t\t: "+this.name);
        System.out.println("Attack power\t: "+this.ATK);
        System.out.println("Health\t\t: "+this.HP);
    }
}
