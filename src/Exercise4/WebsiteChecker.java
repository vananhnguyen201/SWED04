package Exercise4;

public class WebsiteChecker {
    private ComparisonStrategy strategy;

    public WebsiteChecker(ComparisonStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ComparisonStrategy strategy) {
        this.strategy = strategy;
    }

    public void check(Subscription s, User user) {
        boolean changed = detectChange();

        if (changed) {
            s.notifyObservers();
//           Notification n = new Notification("Update found on: " + s.url);
//            NotificationService service = new NotificationService();
//            service.sendNotification(user, n, s.channel);
        }

        s.lastChecked = java.time.LocalDateTime.now();
    }

    // Fake website change detection
    private boolean detectChange() {
        return Math.random() > 0.5; // 50% chance
    }
}
