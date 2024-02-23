package service;

import java.time.LocalDateTime;

public class ConsoleLogger implements Loggable{
    @Override
    public void log(String message) {
        System.out.println(LocalDateTime.now() + message);
    }
}
