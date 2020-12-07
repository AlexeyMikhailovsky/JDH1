package Examples.solid.service.notification.impl;

import solid.core.Item;
import solid.service.notification.api.INotificationSender;

import java.util.List;

public class MultiNotificatorSender implements INotificationSender {

    private static MultiNotificatorSender instance;

    private INotificationSender[] senders;

    public MultiNotificatorSender(INotificationSender... senders) {
        this.senders = senders;
    }

    @Override
    public boolean send(List<Item> order, String to) {
        boolean sended = false;
        for (INotificationSender sender : senders) {
            if(sender.send(order, to)){
                sended = true;
            }
        }
        return sended;
    }

    private MultiNotificatorSender(){

    }

    public static MultiNotificatorSender getInstance() {
        if (instance == null){
            instance = new MultiNotificatorSender();
        }
        return instance;
    }
}
