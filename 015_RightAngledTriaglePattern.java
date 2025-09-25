import java.util.Scanner;

class RightAngledTrianglePattern {
    int rowCount;
    RightAngledTrianglePattern(int rc) {
        this.rowCount = rc;
    }

    void printRightAngledTriange() {
        for(int row=1; row<=this.rowCount; row++) {
            for(int col=1; col<=row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of rows required in printing right angled triangle pattern: ");
        int rowCount = scanner.nextInt();

        RightAngledTrianglePattern obj = new RightAngledTrianglePattern(rowCount);
        obj.printRightAngledTriange();

        scanner.close();
    }
}
