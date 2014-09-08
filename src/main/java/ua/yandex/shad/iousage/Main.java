package ua.yandex.shad.iousage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author andrii
 */
public class Main {

    public static void readWriteFromToStdInOut() {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        in.useLocale(Locale.US);

        int sum = 0;
        while (in.hasNextInt()) {
            sum += in.nextInt();
        }

        out.println(sum);        
               
        out.flush();
    }

    public static void readWriteFromToFile() throws FileNotFoundException, IOException {
        Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));

        // Since JDK 1.7
        /*
         Path path = FileSystems.getDefault().getPath("input.txt");
         Scanner in = new Scanner(Files.newBufferedReader(path));
         */
        
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
        in.useLocale(Locale.US);

        int sum = 0;
        while (in.hasNextInt()) {
            sum += in.nextInt();
        }

        out.println(sum);
        
        in.close();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        readWriteFromToStdInOut();        
    }
}
