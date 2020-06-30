package pattern.behavioral.strategy.email;

public class EmailFields {

    private final String body;
    private final String subject;
    private final String from;

    public EmailFields(String body, String subject, String from) {
        this.body = body;
        this.subject = subject;
        this.from = from;
    }

    public String getBody() {
        return body;
    }

    public String getSubject() {
        return subject;
    }

    public String getFrom() {
        return from;
    }
}
