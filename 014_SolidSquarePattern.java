import java.util.Scanner;

class SolidSquarePattern {
    int rowCount;
    SolidSquarePattern(int count) {
        this.rowCount = count;
    }

    void printSolidSquare() {
        for(int row=1; row<=this.rowCount; row++) {
            for(int col=1; col<=this.rowCount; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of rows in the square pattern: ");
        int number = scanner.nextInt();

        SolidSquarePattern obj = new SolidSquarePattern(number);
        obj.printSolidSquare();

        scanner.close();
    }
}
