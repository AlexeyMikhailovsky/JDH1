package HomeWork5;

import java.io.*;


public class SearchMain {
    public static void main(String[] args) {

        try(Reader reader = new FileReader("G:\\JavaProjects\\JDH1\\HomeWork\\resources\\Война и мир_книга.txt")){
            StringBuilder stringText = new StringBuilder();
            int character;
            while((character = reader.read()) != -1){
                char readedCharacter = (char) character;
                stringText.append(readedCharacter);
            }
            EasySearch easySearch = new EasySearch();
            System.out.println(easySearch.search(stringText.toString(),"Мир"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
