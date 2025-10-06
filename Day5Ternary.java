public class Day5Ternary {
    public static void main(String[] args) {

        // Check if number is positive
        int num1 = -5;
        System.out.println("num1 = " + num1 + "---" + (num1 > 0 ? "Positive" : "Not Positive"));

        // Check if number is even
        int num2 = 10;
        System.out.println("num2 = " + num2 + "---" + (num2 % 2 == 0 ? "Even" : "Odd"));

        // Voting eligibility
        int age1 = 17;
        System.out.println("age1 = " + age1 + "---" + (age1 >= 18 ? "Eligible to vote" : "Not eligible"));

        // Pass/Fail check
        int marks1 = 85;
        System.out.println("marks1 = " + marks1 + "---"+ (marks1 >= 40 ? "Passed" : "Failed"));

        // Even or Odd
        int num3 = 7;
        System.out.println("num3 = " + num3 + "---" + (num3 % 2 == 0 ? "Even" : "Odd"));

        // Positive or Negative
        int num4 = -3;
        System.out.println("num4 = " + num4 + "---" + (num4 >= 0 ? "Positive" : "Negative"));

        //Adult or Minor
        int age2 = 16;
        System.out.println("age2 = " + age2 + "---" + (age2 >= 18 ? "Adult" : "Minor"));

        // Leap Year check
        int year = 2024;
        System.out.println("year = " + year + "---" + ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? "Leap Year" : "Not a Leap Year"));

        // Largest of two numbers
        int a = 10;
        int b = 20;
        System.out.println("a = " + a + ", b = " + b + " --- Largest = " + (a > b ? a : b));

        // Largest of three numbers
        int x = 25;
        int y = 15;
        int z = 30;
        System.out.println("x = " + x + ", y = " + y + ", z = " + z + " --- Largest = " + (x > y ? (x > z ? x : z) : (y > z ? y : z)));

        // Grade assignment
        int marks2 = 75;
        System.out.println("marks2 = " + marks2 + " --- Grade = " + (marks2 >= 80 ? "A" : (marks2 >= 50 ? "B" : "Fail")));

        // Login validation
        String username = "admin";
        String password = "1234";
        String inputUser = "admin";
        String inputPass = "1234";
        System.out.println("username = " + inputUser + ", password = " + inputPass + " → " +
            (username.equals(inputUser) && password.equals(inputPass) ? "Login Successful" : "Login Failed"));
    }
}

