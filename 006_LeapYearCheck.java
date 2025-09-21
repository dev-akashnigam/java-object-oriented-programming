import java.util.Scanner;

class LeapYearCheck {
    int year;

    LeapYearCheck(int y) {
        this.year = y;
    }

    boolean isLeapYear() {
        if(this.year%100 == 0) {
            if(this.year%400 == 0) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if(this.year%4 == 0) {
                return true;
            }
            else {
                return false;
            }
        }
    }

    void displayResult() {
        if(isLeapYear()) {
            System.out.printf("Year: %d is a leap year.", this.year);
        }
        else {
            System.out.printf("Year: %d is NOT leap year.", this.year);
        }
    }
}
class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the year: ");
        int year = scanner.nextInt();

        LeapYearCheck obj = new LeapYearCheck(year);
        obj.displayResult();

        scanner.close();
    }
}