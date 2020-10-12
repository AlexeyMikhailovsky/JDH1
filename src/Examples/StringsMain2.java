package Examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsMain2 {
  static String[] mails = new String[]{
            "sophiabelenkov@gmail.com",
            "mir.lednev@gmail.com",
            "markgoodboy@mail.ru",
            "nik.kizhyk@gmail.com",
            "ivankrot3@gmail.com", "" +
            "alek.kuntsevich@gmail.com",
            "slin@tut.by",
            "aleksmihai00@gmail.com",
            "slava.mytnik@gmail.com",
            "a.l.parfiankou@gmail.com",
            "vica_nika@inbox.ru",
            "m.pimoshenko21@gmail.com",
            "chamrik9191@gmail.com",
            "maxim.rudiak@gmail.com",
            "van00746@gmail.com",
            "Geleldor@live.ru",
            "shaldybin_den1@mail.ru",
            "shatov.alexman@gmail.com" };

    public static void main(String[] args) {
        String reg = "(.+)\\@(\\w+)\\.(\\w+)$";

        Pattern compile = Pattern.compile(reg);

        for (String mail : mails){
            Matcher matcher = compile.matcher(mail);
            if (matcher.find()){
                System.out.println("Домен верхнего уровня: " + matcher.group(3));
                System.out.println("Домен второго уровня: " +matcher.group(2));
                System.out.println("Имя пользователя: " +matcher.group(1));
            }
        }
    }
}
