package atm;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Handler handler100 = new Handler100();
        Handler handler50 = new Handler50();
        Handler handler20 = new Handler20();
        Handler handler5 = new Handler5();
        Handler handler1 = new Handler1();

        handler100.setNext(handler50);
        handler50.setNext(handler20);
        handler20.setNext(handler5);
        handler5.setNext(handler1);

        System.out.println("Please input the value!");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        handler100.process(value);
    }
}
