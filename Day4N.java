public class Day4N {
    public static void main(String[] args) {

        int num = 5;
        if (num > 0) {
            System.out.println("Positive number.");
        }

        num = 8;
        if (num % 2 == 0) {
            System.out.println("Even number.");
        }

        int age = 20;
        if (age >= 18) {
            System.out.println("Eligible to vote.");
        }

        int marks = 45;
        if (marks >= 40) {
            System.out.println("Passed the exam.");
        }

        num = 7;
        if (num % 2 == 0) {
            System.out.println("Even number.");
        } else {
            System.out.println("Odd number.");
        }

        num = -3;
        if (num >= 0) {
            System.out.println("Positive number.");
        } else {
            System.out.println("Negative number.");
        }

        age = 16;
        if (age >= 18) {
            System.out.println("Adult.");
        } else {
            System.out.println("Minor.");
        }

        int year = 2024;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Leap year.");
        } else {
            System.out.println("Not a leap year.");
        }

        int a = 12, b = 9;
        if (a > b) {
            System.out.println(a + " is larger.");
        } else if (b > a) {
            System.out.println(b + " is larger.");
        } else {
            System.out.println("Both are equal.");
        }

        a = 10; b = 20; int c = 15;
        if (a >= b && a >= c) {
            System.out.println(a + " is largest.");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is largest.");
        } else {
            System.out.println(c + " is largest.");
        }

        marks = 78;
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 40) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        String username = "admin";
        String password = "1234";
        if (username.equals("admin")) {
            if (password.equals("1234")) {
                System.out.println("Login successful.");
            } else {
                System.out.println("Incorrect password.");
            }
        } else {
            System.out.println("Invalid username.");
        }

        marks = 85;
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        int units = 250;
        double bill;
        if (units <= 100) {
            bill = units * 1.5;
        } else if (units <= 200) {
            bill = 100 * 1.5 + (units - 100) * 2.5;
        } else {
            bill = 100 * 1.5 + 100 * 2.5 + (units - 200) * 3.5;
        }
        System.out.println("Electricity bill: " + bill);

        double amount = 12000;
        double discount;
        if (amount >= 10000) {
            discount = amount * 0.2;
        } else if (amount >= 5000) {
            discount = amount * 0.1;
        } else {
            discount = amount * 0.05;
        }
        System.out.println("Discount: " + discount);
    }
}

