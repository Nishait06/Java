import java.util.Scanner;
public class Day5switch {   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        // Day of the Week
        System.out.print("Enter a number (1 to 7) for day: ");
        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("It's Monday");
            case 2 -> System.out.println("It's Tuesday");
            case 3 -> System.out.println("It's Wednesday");
            case 4 -> System.out.println("It's Thursday");
            case 5 -> System.out.println("It's Friday");
            case 6 -> System.out.println("It's Saturday");
            case 7 -> System.out.println("It's Sunday");
            default -> System.out.println("Invalid day number");
        }
     

        //  Calculator
        System.out.print("\nEnter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.print("Choose operation (+, -, *, /): ");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+' -> System.out.println("Result: " + (a + b));
            case '-' -> System.out.println("Result: " + (a - b));
            case '*' -> System.out.println("Result: " + (a * b));
            case '/' -> System.out.println(b != 0 ? "Result: " + (a / b) : "Cannot divide by zero");
            default -> System.out.println("Invalid operator");
        }

        // Grade Evaluator
        System.out.print("\nEnter marks (0 to 100): ");
        int marks = sc.nextInt();
        switch (marks / 10) {
            case 10, 9 -> System.out.println("Grade: A");
            case 8 -> System.out.println("Grade: B");
            case 7 -> System.out.println("Grade: C");
            case 6 -> System.out.println("Grade: D");
            default -> System.out.println("Grade: Fail");
        }

        //  Month Name
        System.out.print("\nEnter month number (1-12): ");
        int month = sc.nextInt();
        switch (month) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("Invalid month");
        }

        // Vowel or Consonant
        System.out.print("\n Enter a lowercase alphabet: ");
        char ch = sc.next().charAt(0);
        switch (ch) {
                case 'a', 'e', 'i', 'o', 'u' -> System.out.println(ch + " is a vowel");
                default -> System.out.println(ch + " is a consonant");
            }
            
        }
    }

