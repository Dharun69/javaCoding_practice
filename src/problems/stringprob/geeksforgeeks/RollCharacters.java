package problems.stringprob.geeksforgeeks;
public class RollCharacters {

    // Roll a single character by 1
    public static char rollCharacter(char ch) {
        return (char) (ch + 1);
    }

    // Modify string based on roll list
    public static String modifyString(String target, int[] rollList) {

        char[] chars = target.toCharArray();

        for (int roll : rollList) {
            for (int i = 0; i < roll; i++) {
                chars[i] = rollCharacter(chars[i]);
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {

        String str = "bca";
        int[] rollList = {1, 2, 3};

        String result = modifyString(str, rollList);
        System.out.println(result); // Output: eeb
    }
}