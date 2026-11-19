import java.net.MalformedURLException;
import java.net.URL;

public class URLProcessorDemo {
    public static void main(String[] args) {
        // The URL string to parse
        String urlString = "https://example.com:80/products.html?search=mobile&price<10,000";

        try {
            System.out.println("--- 1. Creating URL Object ---");
            // Using the most common constructor: URL(String spec)
            URL url = new URL(urlString);
            System.out.println("URL successfully created!\n");

            System.out.println("--- 2. Processing URL Components ---");
            // Utilizing various methods of the URL class to extract information
            System.out.println("Full URL:      " + url.toString());
            System.out.println("Protocol:      " + url.getProtocol()); // e.g., https
            System.out.println("Host Name:     " + url.getHost());     // e.g., www.example.com
            System.out.println("Port Number:   " + url.getPort());     // Returns explicitly stated port (8080)
            System.out.println("Default Port:  " + url.getDefaultPort()); // Default port for https (443)
            System.out.println("Path:          " + url.getPath());     // e.g., /path/to/resource.html
            System.out.println("File:          " + url.getFile());     // Path + Query
            System.out.println("Query String:  " + url.getQuery());    // Text after '?' (name=java&version=21)
            System.out.println("Reference/Tag: " + url.getRef());      // Anchor/Bookmark after '#' (introduction)
            System.out.println("Authority:     " + url.getAuthority()); // Host + Port

        } catch (MalformedURLException e) {
            // This exception is thrown if the URL string has an invalid format or unknown protocol
            System.err.println("The provided string is not a valid URL: " + e.getMessage());
        }
    }
}