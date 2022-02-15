import java.util.Scanner;

class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        char sign = scanner.next().charAt(0);
        long b = scanner.nextLong();

        switch (sign) {
            case '+' -> sumTwoNumbers(a, b);
            case '-' -> subtractTwoNumbers(a, b);
            case '*' -> multiplyTwoNumbers(a, b);
            case '/' -> divideTwoNumbers(a, b);
            default -> System.exit(0);
        }
    }

    public static void subtractTwoNumbers(long a, long b) {
        System.out.println(a - b);
    }

    public static void sumTwoNumbers(long a, long b) {
        System.out.println(a + b);
    }

    public static void divideTwoNumbers(long a, long b) {
        if (b != 0) {
            System.out.println(a / b);
        } else {
            System.out.println("Division by 0!");
        }
    }

    public static void multiplyTwoNumbers(long a, long b) {
        System.out.println(a * b);
    }

}
