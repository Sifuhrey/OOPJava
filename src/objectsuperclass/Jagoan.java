package objectsuperclass;

public class Jagoan {
    private String name;

    public Jagoan(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void display(){
        System.out.println("\nNama\t: "+getName());
    }
}
