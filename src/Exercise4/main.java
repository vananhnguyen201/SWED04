package Exercise4;

public class main {
    public static void main(String[] args) {

        User u = new User("Van");

        u.registerWebsite("https://example.com", Frequency.DAILY, ChannelType.EMAIL);
        u.registerWebsite("https://news.com", Frequency.HOURLY, ChannelType.PUSH);

        Scheduler scheduler = new Scheduler();
        scheduler.runChecks(u); // simulate checking

        u.modifySubscription("https://example.com", Frequency.WEEKLY, ChannelType.SMS);

        scheduler.runChecks(u); // check again

        u.cancelSubscription("https://news.com");
    }
}
