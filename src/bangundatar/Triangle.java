package bangundatar;

public class Triangle extends Shape {
    private double base;
    private double height;
    Triangle(){
        this.bentuk = "Segitiga";
        System.out.print("\nMasukkan alas "+this.bentuk+" : ");
        this.base = s.nextDouble();
        System.out.print("Masukkan tinggi "+this.bentuk+" : ");
        this.height = s.nextDouble(); 
    }

    @Override
    public double getArea(){
        return (this.base * this.height) / 2;
    }

    @Override
    public double getCircumference(){
        return this.base + this.height + Math.sqrt(Math.pow(this.base, 2)+Math.pow(this.height, 2));
    }
}
