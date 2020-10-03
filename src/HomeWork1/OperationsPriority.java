package HomeWork1;

import java.util.Scanner;

public class OperationsPriority {
    public static void main(String[] args) {
        int a = 8;
        int b = 2;
        int c;
        boolean f;

        c = 5 + 2 / 8;
        /*
        5
        Делим 2 на 8, получаем 0.25, округляем к 0 т.к. нет приведения типа,
        прибавляем 5
        * */
        c=(5 + 2) / 8;
        /*
        0
        Сложение, затем деление, операции в скобках имеют приоритет выше
         * */
        c=(5 + b++) / 8;
        b = 2;
        /*
        0
        Инкремент произойдет, после выполнения всех операций
         * */
        c=(5 + b++) / --a;
        b = 2;
        a = 8;
        /*
        1
        Сложение в скобках, декремент, деление, инкремент
         * */
        c=(5 * 2 >> b++) / --a;
        b = 2;
        a = 8;
        /*
        0
        Умножение, сдвиг вправо, декремент, деление, инкремент
        1010 >> 2 = 0010 = 2
         * */
        c=(5 + 7 > 20 ? 68 : 22 * 2 >> b++) / --a;
        b = 2;
        a = 8;
        /*
        1
        сложение, сравнение, тернарный оператор, умножение, сдвиг вправо,  декремент, деление, инкремент
        13<20 = 22
        22 * 2 = 44 = 101100
        101100 >> 2 = 001011 = 11
        11 / 7 = 1.57 ~ 1
         * */
        //c=(5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> b++) / --a;
        /*
        java: bad operand types for binary operator '/'
        first type:  java.lang.Object&java.io.Serializable&java.lang.Comparable<? extends
                     java.lang.Object&java.io.Serializable&java.lang.Comparable<?>>
        second type: int
         * */
        f=6 - 2 > 3 && 12 * 12 <= 119;
        /*
        false
        Слева true, справа false
        Вычитание, умножение, сравнение справа, сравнение слева, Оператор И
         * */
        f=true && false;
        /*
        false
        Если хотя бы один из операндов false, то выражение false
         * */

    }
}
