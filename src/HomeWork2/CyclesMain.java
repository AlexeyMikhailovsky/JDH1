package HomeWork2;

import java.util.Scanner;

public class CyclesMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        multiNumber(sc.nextInt());
        multiString(sc.next());
        expNumber(sc.next(),sc.next());
        overflowStack();
        multiTable();

        sc.close();
    }

    //Таблица умножения
    public static void multiTable(){
        int n = 1;
        while(n < 11) {
            for (int j = 2; j < 6; j++) {
                System.out.print(j + " x " + n + " = " + (j * n) + " " );
            }
            n++;
            System.out.println();
        }
        System.out.println();
        n = 1;
        while(n < 11) {
            for (int j = 6; j < 10; j++) {
                System.out.print(j + " x " + n + " = " + (j * n) + " " );
            }
            n++;
            System.out.println();
        }
    }

    //Переполнение
    public static void overflowStack(){
        long a = 1;
        while (a > 0) {
            a = a * 3;
            if ((a * 3) < 0){
                System.out.println("Before overflow: " + a + " After overflow: " + (a * 3));
                break;
            }
        }
    }

    //Разложение числа (1.1)
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

    //Разложение строки (1.2)
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
    }

    //Возведение в степень
    public static void expNumber(final String a, final String b){
        float f = Float.parseFloat(a);
        int exp = Integer.parseInt(b);
        float summ = 1;
        for (int i = 0; i < exp ; i++) {
            summ = summ * f;
        }
        System.out.println(summ);
    }
}
