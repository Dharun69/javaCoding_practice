package numbers;

public class MutiplicationUsingBasicWay {

    public static void multiply() {
        int num1 = 125;
        int num2 = 25;
        int result = 0;
        int place = 1;
        while (num2 > 0) {
            int digit = num2 % 10;   // get last digit (5, then 2)
            int partial = num1 * digit; // 125*5 = 625, 125*2 = 250
            result = result + (partial * place); // shift and add
            place *= 10; // move to next place
            num2 /= 10;
        }

        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        multiply();
    }

}
