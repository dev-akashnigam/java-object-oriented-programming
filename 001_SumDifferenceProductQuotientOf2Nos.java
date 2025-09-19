// Read two numbers and print their sum, difference, product, and quotient.
import java.util.Scanner;

class SumDifferenceProductQuotientOf2Nos {
    int firstNum;
    int secondNum;

    SumDifferenceProductQuotientOf2Nos(int x, int y) {
        this.firstNum = x;
        this.secondNum = y;
    }

    int getSum() {
        return this.firstNum + this.secondNum;
    }

    int getDifference() {
        return this.firstNum - this.secondNum; 
    }

    int getProduct() {
        return this.firstNum * this.secondNum; 
    }

    int getQuotient() {
        return this.firstNum / this.secondNum; 
    }

    void displayResult() {
        System.out.printf("Sum = %d%n", this.getSum());
        System.out.printf("Difference = %d%n", this.getDifference());
        System.out.printf("Product = %d%n", this.getProduct());
        System.out.printf("Quotient = %d%n", this.getQuotient());
    }
}

class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNum = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int secondNum = scanner.nextInt();

        SumDifferenceProductQuotientOf2Nos obj = new SumDifferenceProductQuotientOf2Nos(firstNum, secondNum);
        obj.displayResult();
        
        scanner.close();
    }
}