package lab4.HTMLDownloader;




import java.io.*;
        import java.net.HttpURLConnection;
import java.net.URL;

public class HTMLDownloader {

    public static void main(String[] args) {
        String urlStr = "https://google.com";
        String fileName = "output.html";

        try {
            // Create a URL object
            URL url = new URL(urlStr);

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Get the response code
            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                // If the response is successful, read the HTML content
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder content = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }

                // Display HTML content on the console
                System.out.println("HTML Content:\n" + content);

                // Save HTML content to a file
                saveToFile(content.toString(), fileName);
                System.out.println("HTML content saved to file: " + fileName);

                // Close the reader
                reader.close();
            } else {
                System.out.println("Failed to retrieve HTML content. Response Code: " + responseCode);
            }

            // Disconnect the connection
            connection.disconnect();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void saveToFile(String content, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
        } catch (IOException e) {
            System.err.println("Error saving HTML content to file: " + e.getMessage());
        }
    }
}
