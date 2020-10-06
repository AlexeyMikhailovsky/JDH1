package HomeWork1;

import java.util.Scanner;

//5.3

public class SwitchBranchingMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = sc.nextLine();
        switch (name){
            case "Vasya":
                System.out.println("Hello!");
                System.out.println("I was waiting for you...");
                break;
            case "Anastasia":
                System.out.println("I was waiting for you...");
                break;
            default:
                System.out.println("Who are you?");
        }
        sc.close();
    }
}
