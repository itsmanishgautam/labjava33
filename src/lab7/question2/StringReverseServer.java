package lab7.question2;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class StringReverseServer {

    public static void main(String[] args) {
        try {
            // Create and export the remote object
            StringReverseService stringReverseService = new StringReverseServiceImpl();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("//localhost/StringReverseService", stringReverseService);

            System.out.println("StringReverseService is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
