package Exercise4;

public class NotificationService {

    private User user;

    public NotificationService(User user) {
        this.user = user;
    }

    // This method is called automatically when the Subject (Subscription) notifies observers
    public void update(Subscription subscription) {
        Notification notif = new Notification("Update found on: " + subscription.url);
        sendNotification(notif, subscription.channel);
    }

    public void sendNotification(Notification notif, ChannelType channel) {
        System.out.println("Sending " + channel + " notification to " + user.name);
        System.out.println("Message: " + notif.message);
    }
}

