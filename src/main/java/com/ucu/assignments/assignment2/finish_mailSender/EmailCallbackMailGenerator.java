package com.ucu.assignments.assignment2.finish_mailSender;

@MailCode(2)
public class EmailCallbackMailGenerator implements MailGenerator {

    public String generateHtml(MailInfo mailInfo) {
        return "<html> don't call use we call you</html>";
    }
}
