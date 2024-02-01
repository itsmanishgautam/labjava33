package lab7.question2;
import java.rmi.Naming;

public class StringReverseClient {

    public static void main(String[] args) {
        try {
            // Lookup for the remote object
            StringReverseService stringReverseService = (StringReverseService) Naming.lookup("//localhost/StringReverseService");

            // Call the remote method
            String input = "Hello, RMI!"; // Replace with the desired string
            String result = stringReverseService.reverseString(input);

            // Display the result
            System.out.println("Original String: " + input);
            System.out.println("Reversed String: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
