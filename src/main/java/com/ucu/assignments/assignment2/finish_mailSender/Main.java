package com.ucu.assignments.assignment2.finish_mailSender;

import lombok.SneakyThrows;
import org.fluttercode.datafactory.impl.DataFactory;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        MailSender2 mailSender = new MailSender2();
        DataFactory dataFactory = new DataFactory();

        while (true) {
            MailInfo mailInfo = null;
            mailInfo = new MailInfo(dataFactory.getNumberBetween(1, 4));
            mailInfo.setClient(new Client(dataFactory.getName(), dataFactory.getNumberBetween(10, 100)));
            mailSender.sendMail(mailInfo);

            Thread.sleep(1000);
        }
    }
}
