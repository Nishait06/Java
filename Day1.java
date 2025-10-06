class Day1 {
    public static void main(String[] args) {
        System.out.println("Day 1 of Java programming!");
        char ch='A';
        System.out.println(ch);
        ch++;
        System.out.println(ch);

        byte b=127;
        System.out.println(b);

        short s=32767;
        System.out.println(s);

        int i=2147483647;
        System.out.println(i);

        float f=12.5f;
        System.out.println(f);

        double d=12.5;
        System.out.println(d);

        long l=123456789;
        System.out.println(l);

        boolean bool=true;
        System.out.println(bool);
        bool=false;
        System.out.println(bool);

        String str="Hello World";
        System.out.println(str);

        String str2="Hello \"World\"";
        System.out.println(str2);

        int num1=10;
        int num2=20;
        System.out.println("Sum is: "+(num1+num2));
        System.out.println("Difference is: "+(num1-num2));
        System.out.println("Product is: "+(num1*num2));
        System.out.println("Quotient is: "+(num1/num2));
        System.out.println("Remainder is: "+(num1%num2));

        int a=5;
        System.out.println("Value of a is: "+a);
        System.out.println("Post Increment is: "+a++);
        System.out.println("Pre Increment is: "+(++a));

        int a1=10;
        System.out.println("Value of a1 is: "+a1);
        System.out.println("Post Decrement is: "+a1--);
        System.out.println("Pre Decrement is: "+(--a1));
    }
}