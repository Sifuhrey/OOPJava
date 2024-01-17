package objectsuperclass;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Fakhri");
        Hero hero4 = new Hero("Fakhri");
        Hero hero3 = new Hero("Abdillah");
        Jagoan hero5 = new Jagoan("Fakhri");
        hero1.display();

        //lokasi memori
        Object hero2 = hero1;
        String herostr = hero2.toString();
        System.out.println(herostr);

        String herostr2 = hero1.toString();
        System.out.println(herostr2);

        System.out.println(hero1.equals(hero2));//sama object
        System.out.println(hero1.equals(hero3));//beda object
        System.out.println(hero1.equals(hero5));//beda object
        System.out.println(hero1.equals(hero4));//beda object
    }
}
