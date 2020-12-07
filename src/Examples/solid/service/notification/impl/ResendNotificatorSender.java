package solid.service.notification.impl;

import solid.core.Item;
import solid.service.notification.api.INotificationSender;

import java.util.Arrays;
import java.util.List;

public class ResendNotificatorSender implements INotificationSender {
    private INotificationSender[] senders;

    public ResendNotificatorSender(INotificationSender... senders) {
        this.senders = senders;
    }

    public void add(INotificationSender sender){
        this.senders = Arrays.copyOf(this.senders, this.senders.length + 1);
        this.senders[this.senders.length - 1] = sender;
    }

    @Override
    public boolean send(List<Item> order, String to) {
        for (INotificationSender sender : senders) {
            if(sender.send(order, to)){
                return true;
            }
        }
        return false;
    }
}
