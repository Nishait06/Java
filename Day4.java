class Day4 {

    public static void checkPositive(int num) {
        if (num > 0) {
            System.out.println("Positive number.");
        }
    }

    public static void checkEven(int num) {
        if (num % 2 == 0) {
            System.out.println("Even number.");
        }
    }

    public static void isEligibleToVote(int age) {
        if (age >= 18) {
            System.out.println("Eligible to vote.");
        }
    }

    public static void hasPassedExam(int marks) {
        if (marks >= 40) {
            System.out.println("Passed the exam.");
        }
    }

    public static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("Even number."); 
        }else {
            System.out.println("Odd number.");
        }
    }

    public static void checkSign(int num) {
        if (num >= 0) {
            System.out.println("Positive number."); 
        }else {
            System.out.println("Negative number.");
        }
    }

    public static void checkAgeGroup(int age) {
        if (age >= 18) {
            System.out.println("Adult."); 
        }else {
            System.out.println("Minor.");
        }
    }

    public static void isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Leap year."); 
        }else {
            System.out.println("Not a leap year.");
        }
    }

      public static void findLargestOfTwo(int a, int b) {
        if (a > b) {
            System.out.println(a + " is larger."); 
        }else if (b > a) {
            System.out.println(b + " is larger."); 
        }else {
            System.out.println("Both are equal.");
        }
    }

    public static void findLargestOfThree(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println(a + " is largest."); 
        }else if (b >= a && b >= c) {
            System.out.println(b + " is largest."); 
        }else {
            System.out.println(c + " is largest.");
        }
    }

    public static void assignGrade(int marks) {
        if (marks >= 90) {
            System.out.println("Grade A"); 
        }else if (marks >= 75) {
            System.out.println("Grade B"); 
        }else if (marks >= 40) {
            System.out.println("Grade C"); 
        }else {
            System.out.println("Fail");
        }
    }

    public static void validateLogin(String username, String password) {
        String correctUser = "admin";
        String correctPass = "1234";
        if (username.equals(correctUser)) {
            if (password.equals(correctPass)) {
                System.out.println("Login successful."); 
            }else {
                System.out.println("Incorrect password.");
            }
        } else {
            System.out.println("Invalid username.");
        }
    }

   
    public static void displayGrade(int marks) {
        if (marks >= 90) {
            System.out.println("Grade A"); 
        }else if (marks >= 75) {
            System.out.println("Grade B"); 
        }else if (marks >= 50) {
            System.out.println("Grade C"); 
        }else {
            System.out.println("Fail");
        }
    }

    public static void calculateBill(int units) {
        double bill;
        if (units <= 100) {
            bill = units * 1.5; 
        }else if (units <= 200) {
            bill = 100 * 1.5 + (units - 100) * 2.5; 
        }else {
            bill = 100 * 1.5 + 100 * 2.5 + (units - 200) * 3.5;
        }
        System.out.println("Electricity bill: " + bill);
    }

    public static void calculateDiscount(double amount) {
        double discount;
        if (amount >= 10000) {
            discount = amount * 0.2; 
        }else if (amount >= 5000) {
            discount = amount * 0.1; 
        }else {
            discount = amount * 0.05;
        }
        System.out.println("Discount: " + discount);
    }

   
    public static void main(String[] args) {

        checkPositive(5);
        checkEven(8);
        isEligibleToVote(20);
        hasPassedExam(45);

        checkEvenOdd(7);
        checkSign(-3);
        checkAgeGroup(16);
        isLeapYear(2024);

        findLargestOfTwo(12, 9);
        findLargestOfThree(10, 20, 15);
        assignGrade(78);
        validateLogin("admin", "1234");

        displayGrade(85);
        calculateBill(250);
        calculateDiscount(12000);
    }
}
