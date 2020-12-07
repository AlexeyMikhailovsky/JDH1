package solid;

import solid.core.Item;
import solid.service.notification.api.INotificationSender;
import solid.service.notification.impl.EmailNotificationSender;
import solid.service.notification.impl.TelegramNotificationSender;
import solid.service.notification.impl.ViberNotificationSender;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SolidMain4 {
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
            boolean sended = send(new EmailNotificationSender(), order, "plushkin@mail.ru");
            if(!sended){
                send(new TelegramNotificationSender(), order, "@Plushkin");
            }
        } else if (sendViber) {
            boolean sended = send(new ViberNotificationSender(), order, "+3755555555555555");
            if(!sended){
                send(new TelegramNotificationSender(), order, "@Plushkin");
            }
        } else {
            boolean sended = send(new TelegramNotificationSender(), order, "@Plushkin");
            if(!sended){
                send(new ViberNotificationSender(), order, "@Plushkin");
            }
        }
    }

    public static boolean send(INotificationSender sender, List<Item> order, String to){
        return sender.send(order, to);
    }
}