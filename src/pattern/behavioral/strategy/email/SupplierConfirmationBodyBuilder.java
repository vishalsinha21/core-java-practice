package pattern.behavioral.strategy.email;

import java.util.Map;

public class SupplierConfirmationBodyBuilder implements EmailBodyBuilder {

    @Override
    public EmailFields createMail(Map<String, Object> map) {
        //read template
        
        //replace in the template using map

        //set email fields
        return new EmailFields("body", "subject", "from");
    }
}
