import java.util.Scanner;

class AreaAndPerimeterOfShapes {
    double radiusOfCircle;
    double lengthOfRectangle;
    double widthOfRectangle;
    double side1OfTriangle;
    double side2OfTriangle;
    double side3OfTriangle;

    AreaAndPerimeterOfShapes(double r, double l, double w, double s1, double s2, double s3) {
        this.radiusOfCircle = r;
        this.lengthOfRectangle = l;
        this.widthOfRectangle = w;
        this.side1OfTriangle = s1;
        this.side2OfTriangle = s2;
        this.side3OfTriangle = s3;
    }

    double calcAreaOfCircle() {
        return Math.PI * this.radiusOfCircle * this.radiusOfCircle;
    }

    double calcPerimeterOfCircle() {
        return 2 * Math.PI * this.radiusOfCircle;
    }

    double calcAreaOfRectangle() {
        return this.lengthOfRectangle * this.widthOfRectangle;
    }

    double calcPerimeterOfRectangle() {
        return 2*(this.lengthOfRectangle + this.widthOfRectangle);
    }

    double calcAreaOfTriangle() {
        double semiPerimeter = (this.side1OfTriangle + this.side2OfTriangle + this.side3OfTriangle)/2;
        return Math.sqrt(semiPerimeter * Math.abs(semiPerimeter - this.side1OfTriangle) * Math.abs(semiPerimeter - this.side2OfTriangle) * Math.abs(semiPerimeter - this.side3OfTriangle));
    }

    double calcPerimeterOfTriangle() {
        return this.side1OfTriangle + this.side2OfTriangle + this.side3OfTriangle;
    }

    void displayResult() {
        System.out.printf("Area and Perimeter of Circle of radius: %.2f = %.2f, %.2f%n", this.radiusOfCircle, this.calcAreaOfCircle(), this.calcPerimeterOfCircle());
        System.out.printf("Area and Perimeter of Rectangle of length: %.2f and width: %.2f = %.2f, %.2f%n", this.lengthOfRectangle, this.widthOfRectangle, this.calcAreaOfRectangle(), this.calcPerimeterOfRectangle());
        System.out.printf("Area and Perimeter of Triangle with sides of length: %.2f, %.2f and %.2f = %.2f, %.2f%n", this.side1OfTriangle, this.side2OfTriangle, this.side3OfTriangle, this.calcAreaOfTriangle(), this.calcPerimeterOfTriangle());
    }
}

class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter the radius of circle: ");
        double radiusOfCircle = scanner.nextDouble();

        System.out.println("Please enter the length of rectangle: ");
        double lengthOfRect = scanner.nextDouble();

        System.out.println("Please enter the width of rectangle: ");
        double widthOfRect = scanner.nextDouble();

        System.out.println("Please enter the length of first side of triangle: ");
        double side1OfTriangle = scanner.nextDouble();

        System.out.println("Please enter the length of second side of triangle: ");
        double side2OfTriangle = scanner.nextDouble();

        System.out.println("Please enter the length of third side of triangle: ");
        double side3OfTriangle = scanner.nextDouble();

        AreaAndPerimeterOfShapes obj = new AreaAndPerimeterOfShapes(radiusOfCircle, lengthOfRect, widthOfRect, side1OfTriangle, side2OfTriangle, side3OfTriangle);
        obj.displayResult();

        scanner.close();
    }
}