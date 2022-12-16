package decorator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Measure of time relised here. (TimedDocument)
        long startTime = System.currentTimeMillis();
        Document document = new SmartDocument("gs://oop-course/Geico-2021.png");
        String data = document.parse();
        long endTime = System.currentTimeMillis();
        float result = (endTime - startTime) / 1000F;
        System.out.println("Time of execution: " + result);
        System.out.println("Do you want to see the result?(y or n)" );
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("y")) {
            System.out.println(data);
        }
    }
}