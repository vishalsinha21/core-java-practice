package pattern.behavioral.strategy.email;

import java.util.Map;

public interface EmailBodyBuilder {

    public EmailFields createMail(Map<String, Object> map);
}
