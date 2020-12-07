package solid;

import solid.core.Item;
import solid.service.notification.impl.EmailNotificationSender;
import solid.service.notification.impl.TelegramNotificationSender;
import solid.service.notification.impl.ViberNotificationSender;
import solid.utils.NotificationUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SolidMain2 {
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
            EmailNotificationSender emailNotificationSender = new EmailNotificationSender();
            emailNotificationSender.send(order, "plushkin@mail.ru");
        } else if (sendViber) {
            ViberNotificationSender viberNotificationSender = new ViberNotificationSender();
            viberNotificationSender.send(order, "+3755555555555555");
        } else {
            TelegramNotificationSender telegramNotificationSender = new TelegramNotificationSender();
            telegramNotificationSender.send(order, "@Plushkin");
        }
    }
}