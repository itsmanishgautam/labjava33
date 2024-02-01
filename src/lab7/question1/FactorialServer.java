package lab7.question1;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class FactorialServer {

    public static void main(String[] args) {
        try {
            // Create and export the remote object
            FactorialService factorialService = new FactorialServiceImpl();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("//localhost/FactorialService", factorialService);

            System.out.println("FactorialService is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
