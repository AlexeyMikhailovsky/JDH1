package solid;

import solid.core.Item;
import solid.service.notification.api.INotificationSender;
import solid.service.notification.impl.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SolidMain7 {
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

        ResendNotificatorSender resendSender = new ResendNotificatorSender();
        resendSender.add(new BrokenNotificationSender());
        resendSender.add(new BrokenNotificationSender());
        resendSender.add(new EmailNotificationSender());

        INotificationSender sender = new RetryNotificatorSender(resendSender, 5);

        System.out.println(send(sender, order, "+3755555555555555"));
    }

    public static boolean send(INotificationSender sender, List<Item> order, String to){
        return sender.send(order, to);
    }
}