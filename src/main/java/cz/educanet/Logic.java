package cz.educanet;

import java.util.Scanner;

public class Logic {

    public void init() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator v1.0");
        printMenu();
        System.out.print("What do you want: ");
        int inputMenu = Integer.parseInt(sc.nextLine());
        while (inputMenu != 7) {
            switch (inputMenu) {
                case 1:
                    System.out.print("First number: ");
                    double first = Double.parseDouble(sc.nextLine());
                    System.out.print("Second number: ");
                    double second = Double.parseDouble(sc.nextLine());
                    System.out.println("Summary is: " + plus(first, second));
                    break;
                case 2:
                    System.out.print("First number: ");
                    first = Double.parseDouble(sc.nextLine());
                    System.out.print("Second number: ");
                    second = Double.parseDouble(sc.nextLine());
                    System.out.println("Summary is: " + minus(first, second));
                    System.out.println();
                    break;
                case 3:
                    System.out.print("First number: ");
                    first = Double.parseDouble(sc.nextLine());
                    System.out.print("Second number: ");
                    second = Double.parseDouble(sc.nextLine());
                    System.out.println("Summary is: " + divide(first, second));
                    System.out.println();
                    break;
                case 4:
                    System.out.print("First number: ");
                    first = Double.parseDouble(sc.nextLine());
                    System.out.print("Second number: ");
                    second = Double.parseDouble(sc.nextLine());
                    System.out.println("Summary is: " + times(first, second));
                    System.out.println();
                    break;
                case 5:
                    System.out.print("First number: ");
                    first = Double.parseDouble(sc.nextLine());
                    System.out.print("Second number: ");
                    second = Double.parseDouble(sc.nextLine());
                    System.out.println("Summary is: " + power(first, second));
                    System.out.println();
                    break;
                case 6:
                    System.out.print("Number: ");
                    int factorial = Integer.parseInt(sc.nextLine());
                    System.out.println("Summary is: " + factorial(factorial));
                    System.out.println();
                    break;
            }
            printMenu();
            System.out.print("What do you want next: ");
            inputMenu = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Bye!");
    }
    public double plus(double number1, double number2) {
        return (number1 + number2);
    }
    public double minus(double number1, double number2) {
        return (number1 - number2);
    }
    public double divide(double number1, double number2) {
        return (number1 / number2);
    }
    public double times(double number1, double number2) {
        return (number1 * number2);
    }
    public double power(double number1, double number2) {
        return (Math.pow(number1, number2));
    }
    public int factorial(int number1) {
        if (number1 == 0) return 1;
        return number1 * factorial(number1 - 1);
    }
    public void printMenu() {
        System.out.println("1) Add two numbers.");
        System.out.println("2) Subtract two numbers.");
        System.out.println("3) Divide two numbers.");
        System.out.println("4) Multiply two numbers.");
        System.out.println("5) Power one number.");
        System.out.println("6) Make factorial of one number.");
        System.out.println("7) End calculator.");
    }
}
