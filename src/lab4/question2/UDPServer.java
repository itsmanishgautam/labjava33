package lab4.question2;

import java.net.*;

public class UDPServer {
    public static void main(String[] args) {
        int port = 9876;

        try (DatagramSocket serverSocket = new DatagramSocket(port)) {
            System.out.println("Waiting...");

            while (true) {
                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

                // Receive message from client
                serverSocket.receive(receivePacket);
                String clientMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();

                System.out.println("Received from " + clientAddress + ":" + clientPort + ": " + clientMessage);

                // Respond to the client
                String serverResponse = "Hello, Client! Your message was: " + clientMessage;
                byte[] sendData = serverResponse.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
                serverSocket.send(sendPacket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
