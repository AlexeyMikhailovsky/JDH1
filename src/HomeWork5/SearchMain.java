package HomeWork5;

import java.io.*;


public class SearchMain {
    public static void main(String[] args) {
        final String fileName = "HomeWork" +  File.separator + "resources" + File.separator + "Война и мир_книга.txt";

        TextOperations t = new TextOperations(fileName);

        t.readText();
        t.printWords();

        EasySearch easySearch = new EasySearch();
        System.out.println();
        System.out.println("война - " + easySearch.search(t.text, " война "));
        System.out.println("и - " + easySearch.search(t.text, " и "));
        System.out.println("мир - " + easySearch.search(t.text, " мир "));
    }
}
