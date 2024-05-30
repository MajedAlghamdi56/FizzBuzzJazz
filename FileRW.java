package day3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;
import java.util.Scanner;

public class FileRW {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\dev\\Desktop\\Readmeplease.txt");
        Scanner scanner;

        System.out.println(file.exists());
        System.out.println(file.length());
        System.out.println(file.getPath());

        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
            return;
        }

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }

        scanner.close();

        //////////////////////////////////////////////////////////////////////////////////////
/*
        File file1 = new File("");
        PrintWriter writer;
        try {
            writer = new PrintWriter(file1);
        } catch (FileNotFoundException e) {
            System.out.println("Error creating file.");
            e.printStackTrace();
            return;
        }

        writer.println("This is the first line.");
        writer.println("This is the second line.");
        writer.println("This is the third line.");

        writer.flush();
        writer.close();
*/

    }
    }

