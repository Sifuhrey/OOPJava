package superclass;

public class HeroStrength extends Hero {
    String name = "HeroStrength";

    void display() {
        System.out.println("This is " + this.name);
        method();
    }

    void displaysuper() {
        System.out.println("This is " + super.name);
    }
    private void method(){
        System.out.println("This method is in Subclass\n");
    }
}
