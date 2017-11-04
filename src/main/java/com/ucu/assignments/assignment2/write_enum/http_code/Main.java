package com.ucu.assignments.assignment2.write_enum.http_code;

import lombok.SneakyThrows;
import org.fluttercode.datafactory.impl.DataFactory;

/**
 * Created by bolshanetskyi on 04.11.17.
 */
public class Main {

    private final static DataFactory dataFactory = new DataFactory();

    @SneakyThrows
    public static void main(String[] args) {

        HttpService httpService = new HttpService();

        while (true) {
            httpService.handleHttpCode(dataFactory.getNumberBetween(100, 599));
            Thread.sleep(1000);
        }
    }
}
