package lab4.question2;

import java.net.*;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args) {
        String serverAddress = "localhost";
        int serverPort = 9876;

        try (DatagramSocket clientSocket = new DatagramSocket()) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                // Send a message to the server
                System.out.print("Enter message to send to server (type 'exit' to quit): ");
                String clientMessage = scanner.nextLine();

                if ("exit".equalsIgnoreCase(clientMessage)) {
                    break;
                }

                byte[] sendData = clientMessage.getBytes();
                InetAddress serverAddressObj = InetAddress.getByName(serverAddress);
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddressObj, serverPort);
                clientSocket.send(sendPacket);

                // Receive response from the server
                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                clientSocket.receive(receivePacket);

                String serverResponse = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Received from server: " + serverResponse);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
