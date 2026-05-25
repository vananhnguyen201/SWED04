package Exercise4;

import java.time.LocalDateTime;

public class Notification {
    String message;
    LocalDateTime time;

    public Notification(String message) {
        this.message = message;
        this.time = LocalDateTime.now();
    }
}
