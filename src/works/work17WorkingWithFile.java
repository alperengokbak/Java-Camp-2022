package src.works;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class work17WorkingWithFile {
    public static void createTheFile(){
        File file = new File("C:\\Users\\HP\\vsCode\\javaKodlamaio\\files\\students.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Created The File.");
            } else {
                System.out.println("The file already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void getFileInfo(){
        File file = new File("C:\\Users\\HP\\vsCode\\javaKodlamaio\\files\\students.txt");
        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("File's path: " + file.getAbsolutePath());
            System.out.println("Is the file writable: " + file.canWrite());
            System.out.println("Is the file readable: " + file.canRead());
            System.out.println("Size of File (byte): " + file.length());
        }
    }
    public static void readFile() {
        File file = new File("C:\\Users\\HP\\vsCode\\javaKodlamaio\\files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void writeFile(){
        try {
           BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\HP\\vsCode\\javaKodlamaio\\files\\students.txt", true));
           writer.newLine();
           writer.write("Miami");   //Dosyanın üzerine yazar, içindekileri siler.
           System.out.println("Wrote the element.");
           writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        //createTheFile();
        //getFileInfo();
        writeFile();
        readFile();
        
    }
}
