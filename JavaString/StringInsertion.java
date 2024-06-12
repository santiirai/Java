//Java String Program to Insert a String into Another String.
public class StringInsertion {

    public static void main(String[] args) {
        String originalString = "Hello World";
        String stringToInsert = "Beautiful ";
        int position = 6; // Position at which the string should be inserted

        String resultString = insertString(originalString, stringToInsert, position);
        System.out.println(resultString); // Output: Hello Beautiful World
    }

    public static String insertString(String original, String toInsert, int position) {
        if (position > original.length()) {
            position = original.length();
        }
        // Create a new string with the part before the position, the string to insert, and the part after the position
        return original.substring(0, position) + toInsert + original.substring(position);
    }
}
