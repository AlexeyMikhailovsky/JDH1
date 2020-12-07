package HomeWork6;

import java.util.ArrayList;
import java.util.List;

public class EasyCut {

    public void cut(String text, List<String> textPart) {

        int interval = text.length() / 3 ;
        int parts =1;

        char[] chars = text.toCharArray();

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            str.append(chars[i]);
            if (i == (interval * parts)){
                textPart.add(str.toString());
                str = new StringBuilder();
                parts++;
            }
        }
    }

}
