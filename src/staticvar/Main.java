package staticvar;

class Display{
    private String nama;
    static String type;

    Display(String nama){
        this.nama = nama;
    }

    void show(){
        System.out.println("nama Display : "+this.nama);
    }
    void setType(String type){
        Display.type = type;
    }
    
}
public class Main {
    public static void main(String[] args) {
        Display dis1 = new Display("Layar");
        dis1.show();
        Display dis2 = new Display("Monitor");
        dis2.show();
        dis1.setType("Samsung");
        System.out.println(dis1.type);
        System.out.println(dis2.type);
        System.out.println(Display.type);
        
    }
}
