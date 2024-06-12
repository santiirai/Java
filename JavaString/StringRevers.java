//  Write a Java String Program to Reverse a String.

public class StringRevers {
    public static String reverseString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        String originalString = "Java";
        String reversedString = reverseString(originalString);
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }


}
