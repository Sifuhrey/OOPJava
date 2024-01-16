package objectcasting;

public class Hero {
    protected String name;
    protected int HP;
    protected String type;

    Hero(String name, int HP){
        this.name = name;
        this.HP = HP;
    }

    void display(){
        System.out.println("Nama\t: "+this.name);
        System.out.println("HP\t: "+this.HP);
        System.out.println("tipe\t: "+this.type+"\n");
    }
}
