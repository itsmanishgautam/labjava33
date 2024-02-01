package lab4.question1;

import java.io.*;
import java.net.*;

public class SimpleSocketServer {

    public static void main(String[] args) {
        int port = 8888;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket.getInetAddress().getHostAddress());

                // Set up streams for communication
                BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);

                // Read message from the client
                String clientMessage = reader.readLine();
                System.out.println("Received from client: " + clientMessage);

                // Send a response back to the client
                String serverResponse = "Hello from client.  Your message was: " + clientMessage;
                writer.println(serverResponse);

                // Close the connection with the current client
                clientSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
