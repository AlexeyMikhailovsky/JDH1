package solid.service.notification.api;

import solid.core.Item;

import java.util.List;

public interface INotificationSender {
    boolean send(List<Item> order, String to);
}
