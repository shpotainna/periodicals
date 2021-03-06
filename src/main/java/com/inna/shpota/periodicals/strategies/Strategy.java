package com.inna.shpota.periodicals.strategies;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public abstract class Strategy {
    final static DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm");

    public abstract void handle(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException;
}
