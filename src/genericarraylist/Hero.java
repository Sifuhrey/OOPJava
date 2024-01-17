package genericarraylist;

public class Hero {
    private String name;
    private double health;
    public Hero(String name, double health) {
        this.name = name;
        this.health = health;
    }
    public void setName(String name) {
        this.name = name;
    }
    void display(){
        System.out.println("\nNama : "+this.name);
        System.out.println("HP : "+this.health);
    }
    
}
