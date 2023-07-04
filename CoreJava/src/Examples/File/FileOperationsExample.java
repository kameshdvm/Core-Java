package Examples.File;
import java.io.*;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileOperationsExample {
    public static void main(String[] args) {
        String fileName = "example.txt";

        // Create a new file
        createNewFile(fileName);

        // Write content to the file
        String content = "Hello, World!";
        writeToFile(fileName, content);

        // Read content from the file
        String readContent = readFromFile(fileName);
        System.out.println("File Content: " + readContent);

        // Delete the file
        deleteFile(fileName);
    }

    // Method to create a new file
    public static void createNewFile(String fileName) {
        File file = new File(fileName);
        try {
            boolean isCreated = file.createNewFile();
            if (isCreated) {
                System.out.println("File created successfully: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        }
    }

    // Method to write content to a file
    public static void writeToFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("Content written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    // Method to read content from a file
    public static String readFromFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (FileReader reader = new FileReader(fileName)) {
            int character;
            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
        return content.toString();
    }

    // Method to delete a file
    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            boolean isDeleted = file.delete();
            if (isDeleted) {
                System.out.println("File deleted successfully: " + file.getAbsolutePath());
            } else {
                System.out.println("Failed to delete the file: " + file.getAbsolutePath());
            }
        } else {
            System.out.println("File does not exist: " + file.getAbsolutePath());
        }
    }
}
