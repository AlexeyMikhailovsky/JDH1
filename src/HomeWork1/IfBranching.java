package HomeWork1;

import java.util.Scanner;

public class IfBranching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name: ");
        if (sc.next().equals("Vasya")){
            System.out.println("Hello!");
            System.out.println("I was waiting for you...");
        }
        sc.close();
    }
}
