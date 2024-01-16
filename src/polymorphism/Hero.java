package polymorphism;

public class Hero {
    protected String name;
    protected String type;

    Hero(String name){
        this.name = name;
    }
    void display(){
        System.out.println("\nNama : "+this.name);
        System.out.println("Tipe : "+this.type);
    }
}
