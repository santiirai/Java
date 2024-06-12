public class StringComparison {

    public static void main(String[] args) {
        String string1 = "Hello World";
        String string2 = "Hello";
        String string3 = "Hello World";

        // Using equals method
        boolean isEqual = string1.equals(string2);
        System.out.println("string1 equals string2: " + isEqual); // Output: false

        isEqual = string1.equals(string3);
        System.out.println("string1 equals string3: " + isEqual); // Output: true

    }
}
