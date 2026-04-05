package problems.stringprob.geeksforgeeks;
public class IsogramCheck {
    public static int isIsogram(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isIsogram("machine")); // 1
    }
}