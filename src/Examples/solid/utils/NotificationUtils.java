package solid.utils;

import solid.core.Item;

import java.util.List;

public class NotificationUtils {

    public static boolean sendEmail(List<Item> order, String to){
        System.out.println("Отправляем на адрес " + to);
        System.out.println("Вам письмо. У вас заказ");
        System.out.println("Товары: " + order.toString());
        return true;
    }

    public static boolean sendViber(List<Item> order, String to){
        System.out.println("Отправляем в вайбер " + to);
        System.out.println("Вам письмо. У вас заказ");
        System.out.println("Товары: " + order.toString());

        return true;
    }

    public static boolean sendTelegram(List<Item> order, String to){
        System.out.println("Отправляем в телеграмм " + to);
        System.out.println("Вам письмо. У вас заказ");
        System.out.println("Товары: " + order.toString());

        return true;
    }
}
