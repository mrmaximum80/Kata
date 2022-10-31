package javaCore.module2;

public class IsPalindrome {

    public static boolean isPalindrome(String text) {
        text = text.replaceAll("[^a-zA-Z0-9]", "");
        String reverseText = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reverseText);
    }
}
