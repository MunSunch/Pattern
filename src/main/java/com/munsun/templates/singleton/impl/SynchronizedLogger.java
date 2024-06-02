package com.munsun.templates.singleton.impl;

import com.munsun.templates.singleton.Logger;
import com.munsun.templates.singleton.impl.enums.LogLevels;
import com.munsun.templates.singleton.impl.providers.Printer;
import com.munsun.templates.singleton.impl.providers.impl.Console;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SynchronizedLogger implements Logger {
    private static SynchronizedLogger instance;
    private Printer printer;

    public static SynchronizedLogger getLogger() {
        synchronized (instance) {
            if(instance == null) {
                instance = new SynchronizedLogger(new Console());
                return instance;
            }
            return instance;
        }
    }
    private SynchronizedLogger(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void debug(Object object, String info) {
        printer.print(getTemplate(object, LogLevels.DEBUG, info));
    }

    private String getTemplate(Object object, LogLevels level, String info) {
        return String.format("Log info: %s - %s - %s - %s",
                LocalDate.now().toString(),
                level,
                object.getClass().getSimpleName(),
                info);
    }

    @Override
    public void info(Object object, String info) {
        printer.print(getTemplate(object, LogLevels.INFO, info));
    }

    @Override
    public void warn(Object object, String info) {
        printer.print(getTemplate(object, LogLevels.WARNING, info));
    }

    @Override
    public void error(Object object, String info) {
        printer.print(getTemplate(object, LogLevels.ERROR, info));
    }
}
