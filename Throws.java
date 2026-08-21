//"throws is a keyword used in a method declaration to declare that the method may throw one or more exceptions. It passes the responsibility of handling the exception to the calling method."

import java.io.*;

class FileHandler {

    void readFile() throws IOException {
        FileReader file = new FileReader("data.txt");
        System.out.println("File opened");
    }
}

public class Throws {
    public static void main(String[] args) {

        FileHandler obj = new FileHandler();

        try {
            obj.readFile();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
