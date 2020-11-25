package HomeWork5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TextOperations {

    private String filePath;

    public String text;

    private Set<String> uniqueWords = new HashSet<>();

    private Map<String, Integer> words = new HashMap<>();

    public TextOperations(String filePath) {
        this.filePath = filePath;
    }

    public void readText(){
        readAllBytesJava7(filePath);
    }

    private void readAllBytesJava7(String filePath){
        text = "";
        try
        {
            text = new String ( Files.readAllBytes( Paths.get(filePath) ) );
            
            findUniqueWords(text);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static boolean checkChar(char c) {
        if ((c >= 'A' && c <= 'z') || (c >= 'А' && c <= 'я') || (c == 'Ё' || c == 'ё') || (c == '-'))
            return true;
        return false;
    }

    private void findUniqueWords(String text){
        boolean start = false;
        boolean end = false;
        StringBuilder word = new StringBuilder();
        boolean endText = false;
        char[] textArray = text.toCharArray();
        int i = 0, j = 1;

        while (!endText){
            if (checkChar(textArray[i])) {
                start = true;
                end = false;
            } else {
                start = false;
                end = true;
            }

            if (start)
                word.append(textArray[i]);

            if (end && (word.length() != 0)) {
                uniqueWords.add(word.toString());
                if (words.containsKey(word.toString())) {
                    j = words.get(word.toString());
                    words.remove(word.toString());
                    words.put(word.toString(), ++j);
                } else {
                    words.put(word.toString(), 1);
                }
                word = new StringBuilder();
            }
            i++;
            if (i == text.length()-1){
                endText = true;
            }
        }
        words.remove("--");
    }

    public void printWords() {
        System.out.println("\nUnique words: " + words.size());

        System.out.println("Top 10: ");

        Map<String, Integer> map = words;
        int i = 0, value = 0;
        String key = "";

        while(i < 10) {
            key = "";
            value = 0;
            Set<Map.Entry<String, Integer>> set = map.entrySet();
            for (Map.Entry<String, Integer> word : set) {
                if(word.getValue() > value) {
                    key = word.getKey();
                    value = word.getValue();
                }
            }
            System.out.println(key + " - " + value);
            map.remove(key);
            i++;
        }
    }
}
