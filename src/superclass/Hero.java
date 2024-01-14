package superclass;

public class Hero {
    String name = "Hero";

    void display() {
        System.out.println("This is " + this.name);
        method();
    }
    private void method(){
        System.out.println("This method is in Superclass\n");
    }

}
