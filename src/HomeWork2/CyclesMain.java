package HomeWork2;

import java.util.Scanner;

public class CyclesMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        multiNumber(sc.nextInt());
        multiString(sc.next());
       // longMath(sc.next(),sc.next());

        sc.close();
    }

    public static void multiNumber(final int number){
        int a = number;
        int b = 1;
        for (int i = 1; i <= a; i++) {
            b = b * i;
            if (i != a)
                System.out.print(i+" * ");
            else
                System.out.println(i+" = "+b);
        }
    }

    public static void multiString(final String number){
        String s = number;
        String s1;
        int c = 0;
        int b = 1;
        for (int i = 0; i <= s.length(); i++) {
            try{
                if (i == s.length()-1) {
                    s1 = s.substring(i);
                    c = Integer.parseInt(s1);
                    b = b * c;
                    System.out.print(c+" = "+b);
                    break;
                }
                else
                    s1 = s.substring(i,i+1);
                c = Integer.parseInt(s1);
                System.out.print(c+" * ");
                b = b * c;
                s1="";
            }
            catch (NumberFormatException e)
            {
                c = 0;
                System.out.println("Error in converting String to Integer.");
            }
        }
    }//everything at another class

   // public static String longMath(final String a, final String b){
    //    String summ;




    //    return summ;
   // }

    public static int strToInt(final String s, final int i){
        String s1 = "";
        int c;
        s1 = s.substring(i);
        c = Integer.parseInt(s1);
        return c;
    }
}
