package problems.pattern;

public class DiamondPatterns {

    // Simple diamond (pyramid + inverted pyramid)
    public static void diamondPattern() {
        // Top part
        for (int row = 1; row <= 4; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Bottom part
        for (int row = 1; row <= 4; row++) {
            for (int col = 4; col > row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Diamond using formula (without spaces)
    public static void diamondPattern1(int n) {
        for (int row = 1; row <= n * 2; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Diamond with spaces (center-aligned)
    public static void diamondPattern2(int n) {
        for (int row = 1; row <= n * 2; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            int noOfSpaces = n - totalColsInRow;

            for (int space = 1; space <= noOfSpaces; space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    // Right-angled triangle with spaces
    public static void triangleStarPattern(int n) {
        for (int row = 1; row <= n; row++) {
            int noOfSpaces = n - row;

            for (int space = 1; space <= noOfSpaces; space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Simple diamond pattern:");
        diamondPattern();
        System.out.println("--------------------------------------------------------");

        System.out.println("Formula-based diamond pattern:");
        diamondPattern1(5);
        System.out.println("--------------------------------------------------------");

        System.out.println("Diamond pattern with spaces:");
        diamondPattern2(5);
        System.out.println("--------------------------------------------------------");

        System.out.println("Right-angled triangle with spaces:");
        triangleStarPattern(5);
    }
}