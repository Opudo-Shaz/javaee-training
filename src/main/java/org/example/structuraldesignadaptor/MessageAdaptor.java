package org.example.structuraldesignadaptor;

public class MessageAdaptor {
    private EmailService emailService;

    public MessageAdaptor(EmailService emailService) {
        this.emailService = emailService;
    }

    public void sendSms(String message) {
        // Convert SMS message to email format and send using EmailService
        String emailMessage = "SMS: " + message;
        emailService.sendEmail(emailMessage);
    }
}
