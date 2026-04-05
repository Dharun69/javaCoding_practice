package problems.stringprob.basic;

public class RemoveSpaces {

    // Approach 1: Using loop
    public static void removeSpace() {

        String str = "hello world test";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                result.append(str.charAt(i));
            }
        }

        System.out.println(result.toString());
    }

    // Approach 2: Using inbuilt method
    public static void removeSpace1() {

        String str = "hello world test";

        String result = str.replace(" ", ""); // or replaceAll(" ", "")
        System.out.println(result);
    }

    public static void main(String[] args) {

        removeSpace();
        removeSpace1();
    }
}
