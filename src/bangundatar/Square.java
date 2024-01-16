package bangundatar;

public class Square extends Shape {
    private double side;
   
    Square(){
        this.bentuk = "Persegi";
        System.out.print("\nMasukkan panjang "+this.bentuk+" : ");
        this.side = s.nextDouble();
        
    }

    @Override
    public double getArea(){
        return this.side * this.side;
    }

    @Override
    public double getCircumference(){
        return this.side * 4;
    }
}
