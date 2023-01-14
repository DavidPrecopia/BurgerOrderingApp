package welcome;

public class WelcomeViewEvents {

    private final Event event;
    private final Object data;

    public WelcomeViewEvents(Event event, Object data) {
        this.event = event;
        this.data = data;
    }

    public Event getEvent() {
        return event;
    }

    public Object getData() {
        return data;
    }

    public enum Event {
        INIT,
        BURGER_SELECTED,
        DONE_CLICKED
    }
}