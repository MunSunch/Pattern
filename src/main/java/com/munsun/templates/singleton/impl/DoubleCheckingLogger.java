package com.munsun.templates.singleton.impl;

import com.munsun.templates.singleton.Logger;
import com.munsun.templates.singleton.impl.enums.LogLevels;
import com.munsun.templates.singleton.impl.providers.Printer;
import com.munsun.templates.singleton.impl.providers.impl.Console;

import java.time.LocalDate;

public class DoubleCheckingLogger implements Logger {
    private static volatile DoubleCheckingLogger instance;
    private Printer printer;

    public static DoubleCheckingLogger getLogger() {
        if(instance == null) {
            synchronized (DoubleCheckingLogger.class) {
                if(instance == null)
                    instance = new DoubleCheckingLogger(new Console());
            }
        }
        return instance;
    }
    private DoubleCheckingLogger(Printer printer) {
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
