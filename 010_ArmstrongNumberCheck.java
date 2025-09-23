import java.util.Scanner;

class ArmstrongNumberCheck {
    int number;
    ArmstrongNumberCheck(int num) {
        this.number = num;
    }

    int findDigitsInNumber() {
        int num = this.number;

        int noOfDigits = 0;
        while(num!=0) {
            num = num / 10;
            noOfDigits++;
        }
        return noOfDigits;
    }

    boolean isArmStrongNumber() {
        int num = this.number;
        int totalDigits = this.findDigitsInNumber();

        int lastDigit;
        int sum = 0;
        while(num!=0) {
            lastDigit = num % 10;
            sum = sum + (int)Math.pow(lastDigit, totalDigits);

            num = num / 10;
        }

        return sum==this.number;
    }

    void displayResult() {
        if(this.isArmStrongNumber()) {
            System.out.printf("Number %d is an ARMSTRONG NUMBER.", this.number);
        }
        else {
            System.out.printf("Number %d is NOT ARMSTRONG NUMBER.", this.number);
        }
    }
}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();

        ArmstrongNumberCheck obj = new ArmstrongNumberCheck(num);
        obj.displayResult();

        scanner.close();
    }
}
