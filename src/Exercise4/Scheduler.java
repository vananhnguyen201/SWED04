package Exercise4;

public class Scheduler {

    public void runChecks(User user) {
        WebsiteChecker checker = new WebsiteChecker();

        for (Subscription s : user.subscriptions) {
            checker.check(s, user);
        }
    }
}
