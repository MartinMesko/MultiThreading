package vlakno3;

import java.util.Scanner;

public class App {
        public static void main(String[] args) {
            Processor processor = new Processor();
            processor.start();
            System.out.println("Stlac return pre stop...");

            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();

            processor.shutdown();

        }
    }

