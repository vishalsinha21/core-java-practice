package pattern.behavioral.strategy.email;

import java.util.Map;

public class EmailSender {

    private EmailService emailService;

    public EmailSender(EmailService emailService) {
        this.emailService = emailService;
    }

    public void sendMail(Map<String, Object> map, EmailBodyBuilder bodyBuilder) {
        emailService.sendEmail(
                bodyBuilder.createMail(map));
    }

}
