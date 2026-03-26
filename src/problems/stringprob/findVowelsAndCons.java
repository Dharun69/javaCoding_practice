package problems.stringprob;

public class findVowelsAndCons {

    public static void findVowelsAndConsonants(String str) {

        int vowels = 0;
        int consonants = 0;
        String str1 = str.toLowerCase();
        for(int i=0; i<str1.length(); i++) {
            char ch = str1.charAt(i);
            if(ch >= 'a' && ch <='z') {
                if(ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch =='u') {
                    vowels++;
                } else  {
                    consonants ++;
                }
            }
        }

        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }


    public static void main(String[] args) {
        findVowelsAndConsonants("Hello World");
        findVowelsAndConsonants("Automation");
    }
}
