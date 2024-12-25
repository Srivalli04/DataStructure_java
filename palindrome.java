public class Main {
    public static boolean isPalindrome(String input) {
      
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

       
        int left = 0;
        int right = cleanedInput.length() - 1;

        while (left < right) {
            if (cleanedInput.charAt(left) != cleanedInput.charAt(right)) {
                return false;   // Not a palindrome
            }
            left++;
            right--;
        }

        return true;          // It's a palindrome
    }

    public static void main(String[] args) {
        // Test cases
        String[] testCases = { "madam", "hello", "racecar", "A man, a plan, a canal, Panama" };

        for (String test : testCases) {
            System.out.println("\"" + test + "\" is a palindrome? " + isPalindrome(test));
        }
    }
}
