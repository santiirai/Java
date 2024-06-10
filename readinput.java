//java program to read a input from the Java console
import java.util.Scanner;

public class readinput {

    public static void main(String[] args) {

        // Creating a Scanner to read input from the console
        Scanner sc = new Scanner(System.in);

        //enter a string
        System.out.println("Enter a string:\t");
        String string = sc.nextLine();
        System.out.println("You entered: " + string);

        //enter an integer
        System.out.println("Enter an integer:\t");
        int i = sc.nextInt();
        System.out.println("You entered: " + i);

        //to enter a float
        System.out.println("Enter a float:\t");
        float f = sc.nextFloat();
        System.out.println("You entered: " + f);
    }
}