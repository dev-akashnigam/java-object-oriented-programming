import java.util.Scanner;

class SumOfFirstNNaturalNos {
    int number;
    SumOfFirstNNaturalNos(int num) {
        this.number = num;
    }

    int calcSum() {
        int sum = 0;
        for(int i=1; i<=this.number; i++) {
            sum += i;
        }
        return sum;
    }

    void printResult() {
        System.out.printf("Sum of first %d natural numbers = %d%n", this.number, this.calcSum());
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the Natural Number till where sum is required: ");
        int natNum = scanner.nextInt();

        SumOfFirstNNaturalNos obj = new SumOfFirstNNaturalNos(natNum);
        obj.printResult();

        scanner.close();
    }
}
