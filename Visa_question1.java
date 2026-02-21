package placement_questions;

public class Visa_question1 {
    
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    
    public static void printPalindromicSubstrings(String s) {
        int n = s.length();
        System.out.println("Palindromic substrings:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub = s.substring(i, j);
                if (isPalindrome(sub)) {
                    System.out.println(sub);
                }
            }
        }
    }

    public static void main(String[] args) {
        String str = "abbaeae";
        printPalindromicSubstrings(str);
    }
}
