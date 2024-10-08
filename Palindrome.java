import java.util.Stack;
import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        String cleanedInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase(); // Clean the input string by removing spaces, punctuation, and converting it to lowercase
        
        // Push all characters of the cleaned input onto the stack
        for (char c : cleanedInput.toCharArray()) {
            stack.push(c);
        }

        // Pop characters from the stack and compare with the original string
        for (char c : cleanedInput.toCharArray()) {
            if (stack.pop() != c) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word or phrase to check if it's a palindrome:");
        String input = scanner.nextLine();
        
        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }
}
