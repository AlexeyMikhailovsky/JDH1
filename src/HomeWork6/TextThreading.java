package HomeWork6;

import java.util.concurrent.Callable;

public class TextThreading implements Callable<Long> {

    private String text;

    private String word;

    public TextThreading(String text, String word) {
        this.text = text;
        this.word = word;
    }

    @Override
    public Long call() throws Exception{
        ISearchEngine searchEngine = new EasySearch();
        return searchEngine.search(text, word);
    }
}
