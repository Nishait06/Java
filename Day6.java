
public class Day6 {

    public static void main(String[] args) {
        int n = 5;

        // Right-Angled Star Triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        
        // Inverted Star Triangle
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        //  Number Triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Repeating Row Number
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();

        //  Floyd’s Triangle
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
        System.out.println();
              
        // Star Pyramid
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Diamond Pattern
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Checkerboard Pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(((i + j) % 2 == 0 ? "# " : "@ "));
            }
            System.out.println();
        }
        System.out.println();

        // Binary Triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((j % 2 == 0 ? "0 " : "1 "));
            }
            System.out.println();
        }
        System.out.println();

        // Hollow Square
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* "); 
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
      
     

        // Border Box with Numbers
        System.out.println("\nBorder Box:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(j + " "); 
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // Diagonal Numbers
        System.out.println("\nDiagonal Numbers:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.print(i + " "); 
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // Triangle with Alternating Symbols
        System.out.println("\n Alternating Symbol Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((j % 2 == 0 ? "# " : "* "));
            }
            System.out.println();
        }
        System.out.println();

        
        // Alphabet Triangle (A to E)
        for (char i = 'A'; i <= 'A' + n - 1; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        //  Repeating Row Alphabet
        for (char i = 'A'; i <= 'A' + n - 1; i++) {
            for (int j = 1; j <= (i - 'A' + 1); j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();

        //  Reverse Alphabet Triangle
        for (char i = (char) ('A' + n - 1); i >= 'A'; i--) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
       
        // Inverted Alphabet Pyramid
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) System.out.print("  ");
            for (char j = 'A'; j < 'A' + i; j++) System.out.print(j + " ");
            System.out.println();
        }
        System.out.println();

        // Alphabet Diamond
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (char j = 'A'; j < 'A' + (2 * i - 1); j++) System.out.print(j);
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (char j = 'A'; j < 'A' + (2 * i - 1); j++) System.out.print(j);
            System.out.println();
        }
        System.out.println();

        // Right-Aligned Alphabet Triangle
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print("  ");
            for (char j = 'A'; j < 'A' + i; j++) System.out.print(j + " ");
            System.out.println();
        }
        System.out.println();

        // Mirror Alphabet Triangle
        for (int i = 1; i <= n; i++) {
            for (char j = 'A'; j < 'A' + i; j++) System.out.print(j + " ");
            for (char j = (char) ('A' + i - 2); j >= 'A'; j--) System.out.print(j + " ");
            System.out.println();
        }
        System.out.println();

        // Alphabet Border Box
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1)
                    System.out.print((char) ('A' + j) + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();

        // Alphabet Triangle with ASCII Values
        for (int i = 1; i <= n; i++) {
            for (char j = 'A'; j < 'A' + i; j++) {
                System.out.print((int) j + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

}
