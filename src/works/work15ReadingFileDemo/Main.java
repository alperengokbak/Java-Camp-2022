package src.works.work15ReadingFileDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = null;
        int total = 0;
        try {
        reader = new BufferedReader(new FileReader("C:\\Users\\HP\\vsCode\\javaKodlamaio\\src\\works\\work15ReadingFileDemo\\numbers.txt"));
        String line = null;
        while((line = reader.readLine()) != null){
            total += Integer.valueOf(line);
        }
        System.out.println("Totally: " + total);
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
