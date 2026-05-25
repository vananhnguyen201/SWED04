package Exercise4;

import java.time.LocalDateTime;

public class Subscription {
    String url;
    Frequency frequency;
    ChannelType channel;
    LocalDateTime lastChecked;

    public Subscription(String url, Frequency frequency, ChannelType channel) {
        this.url = url;
        this.frequency = frequency;
        this.channel = channel;
        this.lastChecked = LocalDateTime.now();
    }

    public void updatePreferences(Frequency freq, ChannelType channel) {
        this.frequency = freq;
        this.channel = channel;
    }
}

