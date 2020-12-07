package solid.service.notification.impl;

import solid.core.Item;
import solid.service.notification.api.INotificationSender;

import java.util.List;

public class RetryNotificatorSender implements INotificationSender {

    private INotificationSender sender;
    private int count;

    public RetryNotificatorSender(INotificationSender sender) {
        this.sender = sender;
        this.count = 5;
    }

    public RetryNotificatorSender(INotificationSender sender, int count) {
        this.sender = sender;
        this.count = count;
    }

    @Override
    public boolean send(List<Item> order, String to) {
        for (int i = 0; i < count; i++) {
            if(this.sender.send(order, to)){
                return true;
            }
        }
        return false;
    }
}
