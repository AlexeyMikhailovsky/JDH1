package solid;

import solid.core.Item;
import solid.service.notification.api.INotificationSender;
import solid.service.notification.impl.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SolidMain6 {
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

        boolean sendEmail = true;
        boolean sendViber = false;

        if(sendEmail){
            INotificationSender sender = new ResendNotificatorSender(
                    new BrokenNotificationSender(),
                    new EmailNotificationSender(),
                    new TelegramNotificationSender()
            );

            send(sender, order, "plushkin@mail.ru");
        } else if (sendViber) {
            ResendNotificatorSender sender = new ResendNotificatorSender();
            sender.add(new BrokenNotificationSender());
            sender.add(new EmailNotificationSender());
            sender.add(new TelegramNotificationSender());

            send(sender, order, "+3755555555555555");
        } else {
            send(new RetryNotificatorSender(new TelegramNotificationSender(), 10), order, "@Plushkin");
        }


    }

    public static boolean send(INotificationSender sender, List<Item> order, String to){
        return sender.send(order, to);
    }
}