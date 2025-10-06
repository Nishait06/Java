class Day2
{
    public static void main(String[] args) {
        System.out.println("SIMPLE INTEREST CALCULATOR");
        double principal=10000;
        double rate=5.3;
        double time=2;
        double SI=(principal*rate*time)/100;
        System.out.println("SIMPLE INTEREST: "+SI);
        System.out.println("TOTAL AMOUNT: "+(principal+SI));
        System.out.println("\n");
        System.out.println("KM TO MILES CONVERTER");
        double km=10;
        double miles=km*0.621371;
        System.out.println(km+" KM is equal to "+miles+" MILES");
        System.out.println("\n");
        System.out.println(" MILES TO KM CONVERTER");
        miles=10;
        km=miles/0.621371;
        System.out.println(miles+" MILES is equal to "+km+" KM");
        System.out.println("\n");
        System.out.println("FAHRENHEIT TO CELSIUS CONVERTER");
        double fahrenheit=98.6;
        double celsius=(fahrenheit-32)*5/9;
        System.out.println(fahrenheit+" FAHRENHEIT is equal to: "+celsius+" CELSIUS");
        System.out.println("\n");        
        System.out.println("CELSIUS TO FAHRENHEIT CONVERTER");
        celsius=37;
        fahrenheit=(celsius*9/5)+32;
        System.out.println(celsius+" CELSIUS is equal to: "+fahrenheit+"FAHRENHEIT");
        System.out.println("\n");

        System.err.println("Age Calculator");
        int birthYear = 1990;
        int currentYear = 2025;
        int age = currentYear - birthYear;
        System.err.println("Your age is: " + age + " years");
        System.err.println("\n");
        System.out.println("SALARY CALCULATOR");
        double AnnualSalary = 60000;
        System.out.println("Your Annual Salary is: " + AnnualSalary);
        double MonthlySalary = AnnualSalary / 12;
        System.out.println("Your Monthly Salary is: " + MonthlySalary);
        double WeeklySalary = AnnualSalary / 52;
        System.out.println("Your Weekly Salary is: " + WeeklySalary);
        double DailySalary = AnnualSalary / 365;
        System.out.println("Your Daily Salary is: " + DailySalary);
        System.out.println("\n");
        System.out.println("SWAP TWO NUMBERS");
        int x = 5;
        int y = 10;
        System.out.println("Before swapping: x = " + x + ", y = " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping: x = " + x + ", y = " + y);
    }
}