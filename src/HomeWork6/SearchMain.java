package HomeWork6;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.*;


public class SearchMain {
    public static void main(String[] args) {
        final String fileName = "HomeWork" + File.separator + "resources" + File.separator + "Война и мир_книга.txt";

        List<String> textParts = new ArrayList<>();

        int numberOfParts = 3;

        String text = "";
        try {
            text = new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> words = new ArrayList<>();
        words.add("война");
        words.add("и");
        words.add("мир");

        EasyCut easyCut = new EasyCut();
        easyCut.cut(text, textParts);

        ISearchEngine searchEngine = new EasySearch();
        Callable<Long> thread, thread2, thread3;
        long l = 0l, l1 = 0l , l2 = 0l;

        try {
            thread = () -> searchEngine.search(textParts.get(0), "война");
            thread2 = () -> searchEngine.search(textParts.get(1), "война");
            thread3 = () -> searchEngine.search(textParts.get(2), "война");
            l = thread.call();
            l1 = thread2.call();
            l2 = thread3.call();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Лямбда: война - " + (l+l1+l2));

        ExecutorService executor;
        executor = Executors.newFixedThreadPool(numberOfParts);
        Future<Long> future1;
        Future<Long> future2;
        Future<Long> future3;
        Long word1 = 0l;
        Long word2 = 0l;
        Long word3 = 0l;

        try {
            for (int i = 0; i < words.size(); i++) {
                //future = executor.submit(() -> searchEngine.search(textParts.get(2), "мир"));
                future1 = executor.submit(new TextThreading(textParts.get(i),words.get(0)));
                future2 = executor.submit(new TextThreading(textParts.get(i),words.get(1)));
                future3 = executor.submit(new TextThreading(textParts.get(i),words.get(2)));
                word1 += future1.get();
                word2 += future2.get();
                word3 += future3.get();

            }
            executor.shutdown();
            System.out.println("война - " + word1);
            System.out.println( "и - " + word2);
            System.out.println("мир - "+ word3);
        }catch (RejectedExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
