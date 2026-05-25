package Exercise4;

public class WebsiteChecker {

    public void check(Subscription s, User user) {
        boolean changed = detectChange();

        if (changed) {
            Notification n = new Notification("Update found on: " + s.url);
            NotificationService service = new NotificationService();
            service.sendNotification(user, n, s.channel);
        }

        s.lastChecked = java.time.LocalDateTime.now();
    }

    // Fake website change detection
    private boolean detectChange() {
        return Math.random() > 0.5; // 50% chance
    }
}
