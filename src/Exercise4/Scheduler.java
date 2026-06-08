package Exercise4;

public class Scheduler {

    public void runChecks(User user) {
         // Choose a strategy here (can change this anytime)
        ComparisonStrategy strategy = new HtmlComparisonStrategy();
        WebsiteChecker checker = new WebsiteChecker(strategy);


        for (Subscription s : user.subscriptions) {
            checker.check(s, user);
        }
    }
}
