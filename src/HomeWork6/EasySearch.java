package HomeWork6;

public class EasySearch implements ISearchEngine {

    public long search(String text, String word){
        long count = 0;
        int fromIndex = 0, index;
        boolean f = true;
        while (f){
            index = text.indexOf(word, fromIndex);
            if (index != -1){
                fromIndex = index + word.length();
                count++;
            }else {
                f = false;
            }
        }
        return count;
    }
}
