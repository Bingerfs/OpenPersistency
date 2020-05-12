package it.xpug.birthday_greetings;

public interface EmailService {
    void send(Greeting greeting) throws Exception;
}