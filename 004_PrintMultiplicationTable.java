import java.util.Scanner;

class PrintMultiplicationTable {
    int number;
    PrintMultiplicationTable(int num) {
        this.number = num;
    }

    void printTable() {
        for(int i=1; i<=10; i++) {
            System.out.printf("%d X %d = %d%n", this.number, i, this.number*i);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();

        PrintMultiplicationTable obj = new PrintMultiplicationTable(num);
        obj.printTable();

        scanner.close();
    }
}
