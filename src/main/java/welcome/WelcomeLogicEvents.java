package welcome;

public class WelcomeLogicEvents {

    private final Event event;
    private final Object data;

    public WelcomeLogicEvents(Event event, Object data) {
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
        START_VIEW,
        DISPLAY_INVALID_INPUT
    }

}