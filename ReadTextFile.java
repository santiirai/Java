import java.nio.file.*;
import java.io.IOException;
import java.util.List;

public class ReadTextFile {
    public static void main(String[] args) {
        // Specify the path to the text file
        String filePath = "plain text file."; 

        try {
            // Read all lines from the file
            List<String> lines = Files.readAllLines(Paths.get(filePath));

            // Print each line to the console
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle potential exceptions
            System.err.println("Java program to read a: " + e.getMessage());
        }
    }
}
