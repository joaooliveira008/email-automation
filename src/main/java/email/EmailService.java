package email;

import java.util.ArrayList;
import java.util.List;

public class EmailService {

    public List<Email> getEmails() {
        List<Email> emails = new ArrayList<>();

        Email email1 = new Email ("João", "joao@gmail.com", "Reunião", false);

        Email email2 = new Email ("Maria", "maria@gmail.com", "Pagar o spotify", true);

        emails.add(email1);
        emails.add(email2);

        return emails;

    }
}
