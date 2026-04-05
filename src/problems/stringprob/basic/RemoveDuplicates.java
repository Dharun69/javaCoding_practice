package problems.stringprob.basic;

public class RemoveDuplicates {

    public static void removeDuplicate() {

        String str = "geeksforgeeks";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (unique.indexOf(ch) == -1) {
                unique = unique + ch;
            }
        }

        System.out.println(unique);
    }

    public static void main(String[] args) {
        removeDuplicate();
    }
}
