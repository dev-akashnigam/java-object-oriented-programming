import java.util.Scanner;

class LCM {
    int firstNumber;
    int secondNumber;

    LCM(int fNum, int sNum) {
        this.firstNumber = fNum;
        this.secondNumber = sNum;
    }

    int findLCM() {
        int largerNum;
        int smallerNum;
        if(this.firstNumber > this.secondNumber) {
            largerNum = this.firstNumber;
            smallerNum = this.secondNumber;
        }
        else {
            largerNum = this.secondNumber;
            smallerNum = this.firstNumber;
        }

        int lcm;
        for(int i=1; ; i++) {
            if((largerNum*i)%smallerNum==0) {
                lcm = largerNum*i;
                break;
            }
        }
        return lcm;
    }

    void displayResult() {
        System.out.printf("LCM of %d and %d = %d", this.firstNumber, this.secondNumber, this.findLCM());
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int firstNum = scanner.nextInt();

        System.out.println("Please enter second number: ");
        int secondNum = scanner.nextInt();

        LCM obj = new LCM(firstNum, secondNum);
        obj.displayResult();

        scanner.close();
    }
}
