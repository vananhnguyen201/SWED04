package Exercise4;

import java.util.ArrayList;

public class User {
    String name;
    ArrayList<Subscription> subscriptions = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    // User registers a website
    public void registerWebsite(String url, Frequency freq, ChannelType channel) {
        Subscription s = new Subscription(url, freq, channel);
        subscriptions.add(s);
        System.out.println(name + " subscribed to: " + url);
    }

    // User changes subscription settings
    public void modifySubscription(String url, Frequency newFreq, ChannelType newChannel) {
        for (Subscription s : subscriptions) {
            if (s.url.equals(url)) {
                s.updatePreferences(newFreq, newChannel);
                System.out.println("Updated subscription for: " + url);
            }
        }
    }

    // User cancels subscription
    public void cancelSubscription(String url) {
        subscriptions.removeIf(s -> s.url.equals(url));
        System.out.println("Cancelled subscription for: " + url);
    }
}

