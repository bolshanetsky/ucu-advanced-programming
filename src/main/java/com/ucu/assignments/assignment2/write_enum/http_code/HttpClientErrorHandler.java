package com.ucu.assignments.assignment2.write_enum.http_code;

/**
 * Created by bolshanetskyi on 04.11.17.
 */
public class HttpClientErrorHandler implements HttpHandler {
    @Override
    public void handle() {
        System.out.println("This http code is CLIENT ERROR");
    }
}
