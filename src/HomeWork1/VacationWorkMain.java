package HomeWork1;

import java.util.Scanner;

public class VacationWorkMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean weekday = false;
        boolean vacation = false;

        System.out.println("Format of parametrs: y/n");
        System.out.print("Weekday: ");
        if (sc.next().equals("y")){
            weekday = true;
        }else{
            weekday = false;
        }

        System.out.print("Vacation: ");
        if (sc.next().equals("y")){
            vacation = true;
        }else{
            vacation = false;
        }

        sc.close();

        if (sleepIn(weekday, vacation)){
            System.out.println("sleep");
        }else{
            System.out.println("work");
        }
    }

    public static boolean sleepIn(boolean weekday, boolean vacation){
        boolean slp = false;
        if (!weekday || vacation){
            slp = true;
        } else{
            slp=false;
        }
        return slp;
    }
}
