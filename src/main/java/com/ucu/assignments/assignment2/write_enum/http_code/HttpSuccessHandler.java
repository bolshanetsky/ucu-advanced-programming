package com.ucu.assignments.assignment2.write_enum.http_code;

/**
 * Created by bolshanetskyi on 04.11.17.
 */
public class HttpSuccessHandler implements HttpHandler {
    @Override
    public void handle() {
        System.out.println("This http code is SUCCESS");
    }
}
