package lab7.question1;

import java.rmi.Naming;

public class FactorialClient {

    public static void main(String[] args) {
        try {
            // Lookup for the remote object
            FactorialService factorialService = (FactorialService) Naming.lookup("//localhost/FactorialService");

            // Call the remote method
            int number = 5; // Replace with the desired number
            long result = factorialService.calculateFactorial(number);

            // Display the result
            System.out.println("Factorial of " + number + " is: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
