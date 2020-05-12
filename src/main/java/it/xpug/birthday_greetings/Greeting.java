package it.xpug.birthday_greetings;

public class Greeting {
    public String subject;
    public String body=  "Happy Birthday, dear %NAME%";
    public String recipient;

    public Greeting(Employee employee) {
        subject="Happy Birthday!";
        body.replace("%NAME%", employee.getFirstName());
        recipient = employee.getEmail();
    }
    
}