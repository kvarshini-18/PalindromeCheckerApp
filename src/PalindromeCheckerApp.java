import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Choose algorithm (simple two-pointer approach)
        long startTime = System.nanoTime();

        boolean isPalindrome = checkPalindrome(input);

        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime + " ns");

        scanner.close();
    }

    private static boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}