package problems.stringprob;

public class reverseStr {

    public static void reverse1() {

        String str = "dharun";
        String rev = "";
        for(int i = str.length()-1; i>=0; i--) {
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }

    public static void reverse2(String str) {
        String[] arr = str.split("");
        int left = 0;
        int right = arr.length-1;
        while(left < right) {
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String result = String.join("", arr);
        System.out.println(result);
    }


    public static void main(String[] args) {
        reverse1();
        reverse2("dharun");
    }
}
