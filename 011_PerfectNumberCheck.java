import java.util.Scanner;

class PerfectNumberCheck {
    int number;
    PerfectNumberCheck(int num) {
        this.number = num;
    }

    boolean isPerfect() {
        int num = this.number;
        int halfNum = num / 2;
        int sumOfDivisors = 0;
        for(int i=1; i<=halfNum; i++) {
            if(num%i == 0) {
                sumOfDivisors += i;
            }
        }
        return sumOfDivisors==num;
    }

    void displayResult() {
        if(this.isPerfect()) {
            System.out.printf("Number: %d is a PERFECT NUMBER.", this.number);
        }
        else {
            System.out.printf("Number: %d is NOT PERFECT NUMBER.", this.number);
        }
    } 
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();

        PerfectNumberCheck obj = new PerfectNumberCheck(number);
        obj.displayResult();

        scanner.close();
    }
}
