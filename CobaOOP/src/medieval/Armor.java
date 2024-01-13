package medieval;

class Armor{
    private String name;
    private int strength;
    private int health;

    public Armor(String name, int strength, int health){
        this.name = name;
        this.strength = strength;
        this.health = health;
    }

    public int getAddHP(){
        return this.strength*10 + this.health;
    }

    public int getDEF(){
        return this.strength*2;
    }

}