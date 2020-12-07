package solid.service.notification.impl;

import solid.core.Item;
import solid.service.notification.api.INotificationSender;

import java.util.List;

public class ViberNotificationSender implements INotificationSender {
    @Override
    public boolean send(List<Item> order, String to) {
        System.out.println("Отправляем в вайбер " + to);
        System.out.println("Вам письмо. У вас заказ");
        System.out.println("Товары: " + order.toString());

        return true;
    }
}
