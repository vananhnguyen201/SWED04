package Exercise4;

public class NotificationService {

    public void sendNotification(User user, Notification notif, ChannelType channel) {
        System.out.println("Sending " + channel + " notification to " + user.name);
        System.out.println("Message: " + notif.message);
    }
}
