package bangundatar;

public class Circle extends Shape {
    private double radius;
    final private double pi = Math.PI;

    Circle() {
        this.bentuk = "Lingkaran";
        System.out.print("\nMasukkan radius " + this.bentuk + " : ");
        this.radius = s.nextDouble();

    }

    @Override
    public double getArea() {
        return pi * Math.pow(this.radius, 2);
    }

    @Override
    public double getCircumference() {
        return 2 * pi * this.radius;
    }
}
