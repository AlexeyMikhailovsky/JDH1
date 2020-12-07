package solid;

import solid.core.Item;
import solid.utils.NotificationUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SolidMain1 {
    public static void main(String[] args) {
        List<Item> order = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            Item item = new Item();
            item.setCode(String.valueOf(rnd.nextLong()));
            item.setCount(rnd.nextInt(10));
            item.setPrice(rnd.nextDouble() * 100);
            order.add(item);
        }

        boolean sendEmail = false;
        boolean sendViber = false;

        if(sendEmail){
            NotificationUtils.sendEmail(order, "plushkin@mail.ru");
        } else if (sendViber) {
            NotificationUtils.sendViber(order, "+3755555555555555");
        } else {
            NotificationUtils.sendTelegram(order, "@Plushkin");
        }
    }

}