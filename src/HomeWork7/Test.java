package HomeWork7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        printRates(new NBRBLoader());

        Scanner in = new Scanner(System.in);
        System.out.print("Path:");
        String path = in.nextLine();
        in.close();

        if(path.length() == 0){
            path ="HomeWork" + File.separator + "src" + File.separator + "HomeWork7";
        }

        try {
            File file = new File(path + File.separator + "Курс.txt");
            String exchangeRate = String.valueOf(new NBRBLoader().load(SiteLoader.Currency.EUR));
            String text = SiteLoader.Currency.EUR + " = " + exchangeRate;
            exchangeRate = String.valueOf(new NBRBLoader().load(SiteLoader.Currency.RUB));
            text = text + "\n" + SiteLoader.Currency.RUB + " = " + exchangeRate;
            exchangeRate = String.valueOf(new NBRBLoader().load(SiteLoader.Currency.USD));
            text = text + "\n" + SiteLoader.Currency.USD + " = " + exchangeRate;

            if (!file.exists())
                file.createNewFile();

            FileWriter fw;
            fw = new FileWriter(file.getAbsoluteFile());
            fw.write(text);
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printRates(SiteLoader loader){
        System.out.println(loader.load(SiteLoader.Currency.EUR));
        System.out.println(loader.load(SiteLoader.Currency.RUB));
        System.out.println(loader.load(SiteLoader.Currency.USD));
    }
}
