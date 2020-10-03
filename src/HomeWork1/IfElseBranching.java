package HomeWork1;

import java.util.Scanner;

public class IfElseBranching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = sc.nextLine();
        if ( name.equals("Vasya") ){
            System.out.println("Hello!");
            System.out.println("I was waiting for you...");
        }else if( name.equals("Anastasia") ){
            System.out.println("I was waiting for you...");
        }
        sc.close();
    }
}
