package it.xpug.birthday_greetings;

public class Greeting {
    public String subject;
    public String body;
    public String recipient;

    public Greeting(Employee employee) {
        subject="Happy Birthday!";
        body= "Happy Birthday, dear %NAME%".replace("%NAME%", employee.getFirstName());
        recipient = employee.getEmail();
    }
    
}