import java.util.Scanner;

class PrimeNumberCheck {
    int number;
    PrimeNumberCheck(int num) {
        this.number = num;
    }

    boolean isPrime() {
        if(this.number<=1) {   
            return false;
        }
        else if(this.number == 2) { 
            return true;
        }
        else if(this.number%2 == 0) {
            return false;
        }
        else {
            int sqrt = (int)Math.sqrt(this.number);
            boolean isPrime = true;
            for(int i=3; i<=sqrt; i+=2) {
                if(this.number%i == 0) {
                    isPrime = false;
                    break;
                }
            }
            return isPrime;
        }
    }

    void displayResult() {
        if(this.isPrime()) {
            System.out.printf("Number %d is PRIME.%n", this.number);
        }
        else {
            System.out.printf("Number %d is NOT PRIME.%n", this.number);
        }
    }
}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();

        PrimeNumberCheck obj = new PrimeNumberCheck(num);
        obj.displayResult();

        scanner.close();
    }
}
