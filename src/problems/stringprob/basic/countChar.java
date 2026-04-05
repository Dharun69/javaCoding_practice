package problems.stringprob.basic;

public class countChar {

    public static void countCh(String s1) {
        String result = "";
        int count = 1;
        for(int i=0; i<s1.length(); i++) {
            if(i < s1.length()-1 && s1.charAt(i) == s1.charAt(i+1)) {
                count++;
            } else  {
                result += s1.charAt(i) + "" + count;
                count = 1;
            }

        }
        System.out.println(result);
    }


    public static void countCh1(String s1) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 0; i < s1.length(); i++) {
            if (i < s1.length() - 1 && s1.charAt(i) == s1.charAt(i + 1)) {
                count++;
            } else {
                result.append(s1.charAt(i)).append(count);
                count = 1;
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {

        countCh("aabbbcccaa");
        countCh1("aabbbcccaaaaaa");

    }
}
