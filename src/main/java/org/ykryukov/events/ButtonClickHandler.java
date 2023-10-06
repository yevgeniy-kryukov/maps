package org.ykryukov.events;

public class ButtonClickHandler implements EventHandler{

    @Override
    public void execute() {
        System.out.println("Кнопка нажата!");
    }
}
