package problems.stringprob.basic;

public class UsingIndexOf {



    // 1. Print repeating characters (with duplicates)
    // This will print duplicates (same issue as before)
    public static void printRepeatingCharacters(String str) {
        System.out.println("Repeating characters (with duplicates):");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (str.indexOf(ch) != str.lastIndexOf(ch)) {
                System.out.print(ch + " ");
            }
        }
        System.out.println("\n");
    }

    // 2. Print repeating characters (without duplicates)
    public static void printRepeatingCharactersWithoutDuplicates(String str) {
        System.out.println("Repeating characters (unique):");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (str.indexOf(ch) == i && str.indexOf(ch) != str.lastIndexOf(ch)) {
                System.out.print(ch + " ");
            }
        }
        System.out.println("\n");
    }

    // 3. First non-repeating character
    public static void printFirstNonRepeatingCharacter(String str) {
        System.out.println("First non-repeating character:");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println(ch);
                return;
            }
        }
        System.out.println("None found\n");
    }

    // 4. First repeating character
    public static void printFirstRepeatingCharacter(String str) {
        System.out.println("First repeating character:");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (str.indexOf(ch) != str.lastIndexOf(ch)) {
                System.out.println(ch);
                return;
            }
        }
        System.out.println("None found\n");
    }


    public static void main(String[] args) {
        String str = "stnrinsigghhnhuthh";

        printRepeatingCharacters(str);
        printRepeatingCharactersWithoutDuplicates(str);
        printFirstNonRepeatingCharacter(str);
        printFirstRepeatingCharacter(str);
    }
}