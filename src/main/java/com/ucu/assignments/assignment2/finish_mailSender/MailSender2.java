package com.ucu.assignments.assignment2.finish_mailSender;


import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MailSender2 {

    private Map<Integer, Class<? extends MailGenerator>> map = new HashMap<>();

    public MailSender2() {
        Reflections scanner = new Reflections("com.ucu.assignments.assignment2.finish_mailSender");
        Set<Class<? extends MailGenerator>> classes = scanner.getSubTypesOf(MailGenerator.class);
        for (Class<? extends MailGenerator> aClass : classes) {
            if (!Modifier.isAbstract(aClass.getModifiers())) {
                int mailCode = aClass.getAnnotation(MailCode.class).value();
                map.put(mailCode, aClass);
            }
        }
    }

    @SneakyThrows
    public void sendMail(MailInfo mailInfo) {

        Class<? extends MailGenerator> mailGenerator = map.get(mailInfo.getMailCode());
        if (mailGenerator == null) {
            throw new IllegalStateException(mailInfo.getMailCode() + " not supported yet");
        }

        String html = mailGenerator.newInstance().generateHtml(mailInfo);
        send(html,mailInfo);
    }

    private void send(String html, MailInfo mailInfo) {
        System.out.println("sending to ... " + html);
    }
}
