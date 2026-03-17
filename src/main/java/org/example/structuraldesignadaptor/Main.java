package org.example.structuraldesignadaptor;

public class Main {
    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        SmsService smsService = new SmsService(emailService);

        smsService.sendSms("Hello, this is a message sent via SMS!");
    }
}
