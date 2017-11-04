package com.ucu.assignments.assignment2.write_enum.http_code;

public enum HttpStatus {
    INFORMATIONAL(100, 199, new HttpInformationalHandler()),
    SUCCESS(200, 299, new HttpSuccessHandler()),
    REDIRECTION(300, 399, new HttpRedirectionHandler()),
    CLIENT_ERROR(400, 499, new HttpClientErrorHandler()),
    SERVER_ERROR(500, 599, new HttpServerErrorHandler());

    private final String description;
    private final int maxCode;
    private final int minCode;
    private HttpHandler handler;

    HttpStatus(int minCode, int maxCode, HttpHandler httpHandler) {
        this.minCode = minCode;
        this.maxCode = maxCode;
        this.description = this.toString();
        this.handler = httpHandler;
    }

    public static HttpStatus findByHttpCode(int code) {
        HttpStatus[] statuses = values();
        for (HttpStatus status: statuses) {
            if (code >= status.minCode && code <= status.maxCode) {
                return status;
            }
        }

        throw new IllegalArgumentException("illegal error code - " + code);
    }

    public String getDescription() {
        return description;
    }

    public HttpHandler getHandler() {
        return handler;
    }
}
