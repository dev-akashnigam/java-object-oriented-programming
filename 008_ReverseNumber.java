import java.util.Scanner;
class ReverseNumber {
    int number;
    ReverseNumber(int num) {
        this.number = num;
    }

    int getReversedNumber() {
        int originalNumber = this.number;
        int reversedNumber = 0;
        int lastDigit;

        while(originalNumber!=0) {
            lastDigit = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;

            originalNumber = originalNumber / 10;
        }

        return reversedNumber;
    }

    void displayResult() {
        System.out.printf("Reversed Number of number %d = %d%n", this.number, this.getReversedNumber());
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();

        ReverseNumber obj = new ReverseNumber(num);
        obj.displayResult();

        scanner.close();
    }
}
