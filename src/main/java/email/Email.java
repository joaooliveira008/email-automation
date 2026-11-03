package email;
import java.util.List;
import java.util.ArrayList;

public class Email {
    String sender;
    String emailAddress;
    String body;
    boolean isRead;

    public Email (String sender, String emailAddress, String body, boolean isRead ) {

        this.sender = sender;
        this.emailAddress = emailAddress;
        this.body = body;
        this.isRead = isRead;

    }

    public List<Email> getEmails() {
        List<Email> emails = new ArrayList<>();

        return emails;

    }
}




