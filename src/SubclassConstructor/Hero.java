package SubclassConstructor;

public class Hero {
    String name;
    double DEF;
    Hero(String name, double DEF){
        this.name = name;
        this.DEF = DEF;
    }
    Hero(String name){
        this.name = name;
    }
    void display(){
        System.out.println("Nama\t: "+this.name+", DEF\t: "+this.DEF);
    }
}
