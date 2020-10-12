package Examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsMain {
    public static void main(String[] args) {
        String special = "\"";
        String reg  = "(\\w+)\\.by";
        String urls = "https://finance.tut.by/ https://yandex.by/ https://e.mail.ru"+
                      "ww.onliner.by  "+"sada asa  d sd"+
                      "dank memes";

        boolean matches = Pattern.matches(reg,urls);

        System.out.println(matches);

        Pattern pattern = Pattern.compile(reg);

        Matcher matcher = pattern.matcher(urls);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
