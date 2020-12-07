package solid.service.notification.impl;

import solid.core.Item;
import solid.service.notification.api.INotificationSender;

import java.util.List;

public class BrokenNotificationSender implements INotificationSender {
    @Override
    public boolean send(List<Item> order, String to) {
        System.out.println("Отправить сообще в WeChat не удалось");
        return false;
    }
}
