package mobil;

public class jalankan {
    public static void main(String[ ] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();
        v2.setColor("green");
        v1.setColor("Red");
        System.out.println(v1.getColor());
        System.out.println(v2.getColor());
      }
}
