package email;
import java.util.List;
import java.util.ArrayList;

public class Email {
    private String sender;
    private String emailAddress;
    private String body;
    private boolean isRead;

    public Email (String sender, String emailAddress, String body, boolean isRead ) {

        this.sender = sender;
        this.emailAddress = emailAddress;
        this.body = body;
        this.isRead = isRead;

    }

    public List<Email> getEmails() {
        List<Email> emails = new ArrayList<>();

        Email email1 = new Email ("Joã", "joao@gmail.com", "Reunião", false);

        Email email2 = new Email ("Maria", "maria@gmail.com", "Pagar o spotify", true);

        emails.add(email1);
        emails.add(email2);

        return emails;

    }
}




