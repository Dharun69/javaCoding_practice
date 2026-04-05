package problems.stringprob.basic;
public class ReplaceSpace {

    public static String replaceSpaceWithStarUsingBuiltIn(String input) {
        return input.replace(" ", "*");
    }

    public static void main(String[] args) {
        String input = "ab c";
        String output = replaceSpaceWithStarUsingBuiltIn(input);
        System.out.println(output);
    }
}