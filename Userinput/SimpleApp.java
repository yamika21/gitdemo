import java.util.Scanner;

public class SimpleApp {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            System.out.println("\nHello " + name + "! Welcome to Java.");

            System.out.println("You are " + age + " years old.");

            if (age >= 18) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You are not eligible to vote yet.");
            }

            System.out.println("Have a great day learning Java!");
        }
    }
}