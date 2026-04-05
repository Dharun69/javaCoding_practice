package problems.pattern;
public class StarPatterns {

    // Right-angled triangle
    public static void rightAngleTriangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Right-angled triangle using spaces
    public static void rightAngleTriangle1(int n) {
        for (int row = 1; row <= n; row++) {
            String stars = "";
            for (int col = 1; col <= row; col++) {
                stars += "* ";
            }
            System.out.println(stars);
        }
    }

    // Square pattern
    public static void squarePattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Inverted right-angled triangle (method 1)
    public static void invertedRightAngleTriangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Inverted right-angled triangle (method 2)
    public static void invertedRightAngleTriangle1(int n) {
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Inverted right-angled triangle (method 3)
    public static void invertedRightAngleTriangle2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Right-angled triangle:");
        rightAngleTriangle(5);
        System.out.println("--------------------------------------------------------");

        System.out.println("Right-angled triangle with spaces:");
        rightAngleTriangle1(4);
        System.out.println("--------------------------------------------------------");

        System.out.println("Square pattern:");
        squarePattern(5);
        System.out.println("--------------------------------------------------------");

        System.out.println("Inverted right-angled triangle (1):");
        invertedRightAngleTriangle(6);
        System.out.println("--------------------------------------------------------");

        System.out.println("Inverted right-angled triangle (2):");
        invertedRightAngleTriangle1(5);
        System.out.println("--------------------------------------------------------");

        System.out.println("Inverted right-angled triangle (3):");
        invertedRightAngleTriangle2(5);
    }
}
