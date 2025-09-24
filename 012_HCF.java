import java.util.Scanner;
class HCF {
    int firstNum;
    int secondNum;
    HCF(int a, int b) {
        this.firstNum = a;
        this.secondNum = b;
    }

    int findHCF() {
        int largerNum;
        int smallerNum;

        if(this.firstNum > this.secondNum) {
            largerNum = this.firstNum;
            smallerNum = this.secondNum;
        }
        else {
            largerNum = this.secondNum;
            smallerNum = this.firstNum;
        }

        int hcf = 1;
        for(int i=smallerNum; i>1; i--) {
            if(largerNum%i==0 && smallerNum%i==0) {
                hcf = i;
                break;
            }
        }
        return hcf;
    }

    void displayResult() {
        System.out.printf("HCF of %d and %d = %d", this.firstNum, this.secondNum, this.findHCF());
    }    
}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        int firstNum = scanner.nextInt();

        System.out.println("Please enter the second number: ");
        int secondNum = scanner.nextInt();

        HCF obj = new HCF(firstNum, secondNum);
        obj.displayResult();

        scanner.close();
    }
}
