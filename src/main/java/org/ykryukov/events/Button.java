package ykryukov.events;

public class Button {
    private final EventHandler handler;

    Button(EventHandler handler) {
        this.handler = handler;
    }

    public void click() {
        handler.execute();
    }
}
