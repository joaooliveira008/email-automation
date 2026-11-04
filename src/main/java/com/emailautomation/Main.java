package com.emailautomation;

import com.emailautomation.email.Email;
import com.emailautomation.email.EmailService;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        EmailService service = new EmailService();

        List<Email> emails = service.getEmails();

        for (Email email : emails) {
            System.out.println(email.sender);
            System.out.println(email.body);
        }
    }
}


