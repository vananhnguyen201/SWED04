package Exercise4;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Subscription {

    String url;
    Frequency frequency;
    ChannelType channel;
    LocalDateTime lastChecked;

    private ArrayList<NotificationService> observers = new ArrayList<>();

    public Subscription(String url, Frequency frequency, ChannelType channel) {
        this.url = url;
        this.frequency = frequency;
        this.channel = channel;
        this.lastChecked = LocalDateTime.now();
    }

    public void addObserver(NotificationService o) {
        observers.add(o);
    }

    public void removeObserver(NotificationService o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (NotificationService o : observers) {
            o.update(this);
        }
    }
    public void updatePreferences(Frequency newFreq, ChannelType newChannel) {
        this.frequency = newFreq;
        this.channel = newChannel;
        System.out.println("Subscription preferences updated: " + url);
    }
}
