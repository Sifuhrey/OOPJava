package objectsuperclass;

public class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }
    public void display(){
        System.out.println("nama\t: "+getName());
    }

    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject){
            System.out.println("\nObject dengan reference sama");
            return true;
        }
        else if(this.getClass() == otherObject.getClass()){
            System.out.println("\nObject dengan Class sama");
            System.out.println("Reference berbeda");
            Hero other = (Hero) otherObject;
            if(this.name == other.name){
                System.out.println("Nama sama");
                return true;
            }else{
                System.out.println("Nama Beda");
                return false;
            }
            
        }
        else{
            return false;
        }
    }
    
}
