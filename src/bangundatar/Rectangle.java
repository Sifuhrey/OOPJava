package bangundatar;

public class Rectangle extends Shape {
    private double length;
    private double width;
    Rectangle(){
        this.bentuk = "Persegi Panjang";
        System.out.print("\nMasukkan panjang "+this.bentuk+" : ");
        this.length = s.nextDouble();
        System.out.print("Masukkan lebar "+this.bentuk+" : ");
        this.width = s.nextDouble(); 
    }

    @Override
    public double getArea(){
        return this.length * this.width;
    }

    @Override
    public double getCircumference(){
        return 2 *(this.length + this.width);
    }
}
