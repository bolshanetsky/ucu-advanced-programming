package com.ucu.assignments.assignment2.finish_mailSender;

@MailCode(3)
public class HappyBirthdayMailGenerator implements MailGenerator {

    public String generateHtml(MailInfo mailInfo) {
        return "happy birthday " + mailInfo.getClient().getName();
    }
}
