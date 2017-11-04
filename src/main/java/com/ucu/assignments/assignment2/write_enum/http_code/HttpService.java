package com.ucu.assignments.assignment2.write_enum.http_code;

public class HttpService {
    public void handleHttpCode(int code) {
        HttpStatus httpStatus = HttpStatus.findByHttpCode(code);
        System.out.println("code = " + code);
        httpStatus.getHandler().handle();
    }
}
