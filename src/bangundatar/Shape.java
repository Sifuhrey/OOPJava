package bangundatar;

import java.util.Scanner;

public abstract class Shape {
    Scanner s = new Scanner(System.in);
    protected String bentuk;

    abstract double getArea();

    abstract double getCircumference();

    void display() {
        System.out.printf("\nLuas %s : %.2f\n", this.bentuk, getArea());
        System.out.printf("Keliling %s : %.2f\n", this.bentuk, getCircumference());
    }
}
