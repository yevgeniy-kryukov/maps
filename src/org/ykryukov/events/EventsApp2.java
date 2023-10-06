package org.ykryukov.events;

public class EventsApp2 {
    public static void main(String[] args) {
        Button buttonTV = new Button(new EventHandler() {
            private boolean on = false;

            @Override
            public void execute() {
                if(on) {
                    System.out.println("Телевизор выключен!");
                    on = false;
                } else {
                    System.out.println("Телевизор включен!");
                    on = true;
                }
            }
        });

//        Button buttonPrint = new Button(new EventHandler() {
//            @Override
//            public void execute() {
//                System.out.println("Запущена печать на принтере...");
//            }
//        });

        Button buttonPrint = new Button(()-> System.out.println("Запущена печать на принтере..."));

        buttonTV.click();
        buttonPrint.click();
        buttonTV.click();
    }
}
