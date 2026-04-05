package problems.stringprob.basic;

public class SeparateAandB {

    public static void separateStrings(String mixedString) {

        StringBuilder stringA = new StringBuilder();
        StringBuilder stringB = new StringBuilder();

        for (int i = 0; i < mixedString.length(); i++) {
            char ch = mixedString.charAt(i);

            if (ch == 'A') {
                stringA.append(ch);
            } else if (ch == 'B') {
                stringB.append(ch);
            }
        }

        System.out.println("String A : " + stringA.toString());
        System.out.println("String B : " + stringB.toString());
    }

    public static void main(String[] args) {

        String mixedString = "ABABABBBABA";

        System.out.println("The separated strings are: " + mixedString);
        separateStrings(mixedString);
    }
}
