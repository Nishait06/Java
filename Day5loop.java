public class Day5loop {
    public static void main(String[] args) {

        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("\n While loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("j = " + j);
            j++;
        }

        System.out.println("\n Do-While loop:");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 5);

    
        System.out.println("\n Break example:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Breaking at i = " + i);
                break;
            }
            System.out.println("i = " + i);
        }

        System.out.println("\n Continue example:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping i = " + i);
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}


