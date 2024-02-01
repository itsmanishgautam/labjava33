package lab4.question1;

import java.io.*;
import java.net.*;

public class SimpleSocketClient {

    public static void main(String[] args) {
        String serverAddress = "localhost";
        int serverPort = 8888;

        try (Socket socket = new Socket(serverAddress, serverPort)) {
            // Set up streams for communication
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            // Send a message to the server
            String clientMessage = "Hello from client";
            writer.println(clientMessage);
            System.out.println("Sent to server: " + clientMessage);

            // Receive the server's response
            String serverResponse = reader.readLine();
            System.out.println("Received from server: " + serverResponse);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

