package solid;

import solid.core.Item;
import solid.service.notification.api.INotificationSender;
import solid.service.notification.impl.EmailNotificationSender;
import solid.service.notification.impl.TelegramNotificationSender;
import solid.service.notification.impl.ViberNotificationSender;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SolidMain5 {
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
            send(new EmailNotificationSender(), order, "plushkin@mail.ru");
        } else if (sendViber) {
            send(new ViberNotificationSender(), order, "+3755555555555555");
        } else {
            send(new TelegramNotificationSender(), order, "@Plushkin");
        }
    }

    public static boolean send(INotificationSender sender, List<Item> order, String to){
        boolean sended = sender.send(order, to);
        if(!sended){
            sended = send(new ViberNotificationSender(), order, "@Plushkin");
        }
        return sended;
    }
}