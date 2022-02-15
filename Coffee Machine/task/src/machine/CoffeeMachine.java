package machine;
import java.util.*;
import static java.lang.System.out;

public class CoffeeMachine {
    enum Status {
        START, BUY, FILL, TAKE, REMAINING, EXIT
    }

    static Status status = Status.START;

    public static void main(String[] args) {

        while (status != Status.EXIT) {
            status = Status.START;
            Work.start();
            switch (input()) {
                case "buy":
                    status = Status.BUY;
                    Work.buy();
                    break;
                case "fill":
                    status = Status.FILL;
                    Work.fill();
                    break;
                case "take":
                    status = Status.TAKE;
                    Work.take();
                    break;
                case "remaining":
                    status = Status.REMAINING;
                    Work.remaining();
                    break;
                case "exit":
                    status = Status.EXIT;
                    break;
                default:
                    out.println("Unknown command!");
            }
        }
        System.exit(0);
    }

    public static String input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

class Work {

    static int water = 400;
    static int milk = 540;
    static int coffee = 120;
    static int cups = 9;
    static int money = 550;

    public static void start() {
        out.println("Write action (buy, fill, take, remaining, exit): ");

    }
    public static void buy() {
        out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");

        switch (CoffeeMachine.input()) {
            case "1":
                if (water >= 250 && coffee >= 16 && cups >= 1) {
                    out.println("I have enough resources, making you a coffee!");
                    water -= 250;
                    coffee -= 16;
                    money += 4;
                    cups -= 1;
                } else  {
                    shortage(250,0,16,1);
                }
                break;
            case "2":
                if (water >= 350 && milk >= 75 && coffee >= 20 && cups >= 1) {
                    out.println("I have enough resources, making you a coffee!");
                    water -= 350;
                    milk -= 75;
                    coffee -= 20;
                    money += 7;
                    cups -= 1;
                } else {
                    shortage(250,75,20,1);
                }
                break;
            case "3":
                if (water >= 200 && milk >= 100 && coffee >= 12 && cups >= 1) {
                    water -= 200;
                    milk -= 100;
                    coffee -= 12;
                    money += 6;
                    cups -= 1;
                } else {
                    shortage(200,100,12,1);
                }
                break;
        }
    }
    public static void fill() {
        out.println("Write how many ml of water you want to add: ");
        water += Integer.parseInt(CoffeeMachine.input());
        out.println("Write how many ml of milk you want to add: ");
        milk += Integer.parseInt(CoffeeMachine.input());
        out.println("Write how many grams of coffee beans you want to add: ");
        coffee += Integer.parseInt(CoffeeMachine.input());
        out.println("Write how many disposable cups of coffee you want to add: ");
        cups += Integer.parseInt(CoffeeMachine.input());
    }
    public static void take() {
        out.printf("I gave you $%d\n", money);
        money = 0;
    }
    public static void remaining() {
        out.printf("The coffee machine has: \n" +
                "%d ml of water\n" +
                "%d ml of milk\n" +
                "%d g of coffee beans\n" +
                "%d disposable cups\n" +
                "$%d of money\n" +
                "\n" +
                "Write action (buy, fill, take): ", water, milk, coffee, cups, money);
    }
    public static void shortage ( int waterC, int milkC, int coffeeC, int cupsC) {
        String lackOf = "";
        if (waterC > water) {
            lackOf = "water";
        } else if (milkC > milk) {
            lackOf = "milk";
        } else if (coffeeC > coffee) {
            lackOf = "coffee";
        } else {
            lackOf = "cups";
        }
        out.printf("Sorry, not enough %s!\n", lackOf);
    }
}