import java.util.Scanner;

class EvenOrOdd {
    int number;
    EvenOrOdd(int num) {
        this.number = num;
    }

    boolean isEven() {
        return this.number%2 == 0;
    }

    void displayResult() {
        if(this.isEven()) {
            System.out.printf("Number: %d is even.", this.number);
        }
        else {
            System.out.printf("Number: %d is odd.", this.number);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();

        EvenOrOdd obj = new EvenOrOdd(num);
        obj.displayResult();

        scanner.close();
    }
}
