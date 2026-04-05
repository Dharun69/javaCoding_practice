package problems.arrayprob.geeksforgeeks.basic;

public class TotalFineCalculator {

    public static int totalFine(int date, int[] car, int[] fine) {
        int result = 0;

        for (int i = 0; i < car.length; i++) {
            int lastDigit = car[i] % 10;

            // If date is even, collect fines from cars ending with odd numbers
            // If date is odd, collect fines from cars ending with even numbers
            if ((date % 2 == 0 && lastDigit % 2 != 0) || (date % 2 != 0 && lastDigit % 2 == 0)) {
                result += fine[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int date = 12;
        int[] car = {2375, 7682, 2325, 2352};
        int[] fine = {250, 500, 350, 200};

        int total = totalFine(date, car, fine);
        System.out.println("Total fine collected: " + total);
    }
}