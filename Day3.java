class Day3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        // Arithmetic operators
        System.out.println("Arithmetic:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b)); 
        System.out.println("a % b = " + (a % b));
        System.out.println();
        
        // Relational operators
        System.out.println("Relational:");
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println();
        
        // Logical operators  
        System.out.println("a > 5 && b < 5 = " + (a > 5 && b < 5));
        System.out.println("a > 5 && b > 5 = " + (a > 5 && b > 5));
        System.out.println("a > 5 || b < 5 = " + (a > 5 || b < 5));
        System.out.println("a > 5 || b > 5 = " + (a > 5 || b > 5));
        System.out.println("!a > 5 = " + (!(b < 5)));
        System.out.println();
       
        // Increment and decrement
        int x = 5;
        System.out.println("Increment / Decrement:");
        System.out.println("x = " + x);
        System.out.println("x++ (post-increment returns old value): " + (x++));
        System.out.println("after x++ x = " + x);
        System.out.println("++x (pre-increment returns new value): " + (++x));
        System.out.println("x-- (post-decrement returns old value): " + (x--));
        System.out.println("after x-- x = " + x);
        System.out.println("--x (pre-decrement returns new value): " + (--x));
    }
}
