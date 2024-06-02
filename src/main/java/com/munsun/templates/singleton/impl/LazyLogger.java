package com.munsun.templates.singleton.impl;

import com.munsun.templates.singleton.Logger;
import com.munsun.templates.singleton.impl.enums.LogLevels;
import com.munsun.templates.singleton.impl.providers.Printer;
import com.munsun.templates.singleton.impl.providers.impl.Console;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LazyLogger implements Logger {
    private static LazyLogger instance;
    private List<Printer> printers;

    public static LazyLogger getLogger() {
        if(instance == null) {
            instance = new LazyLogger();
            return instance;
        }
        return instance;
    }
    private LazyLogger() {
        this.printers = new ArrayList<>();
            printers.add(new Console());
    }

    @Override
    public void debug(Object object, String info) {
        printers.forEach(printer -> printer.print(getTemplate(object, LogLevels.DEBUG, info)));
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
        printers.forEach(printer -> printer.print(getTemplate(object, LogLevels.INFO, info)));
    }

    @Override
    public void warn(Object object, String info) {
        printers.forEach(printer -> printer.print(getTemplate(object, LogLevels.WARNING, info)));
    }

    @Override
    public void error(Object object, String info) {
        printers.forEach(printer -> printer.print(getTemplate(object, LogLevels.ERROR, info)));
    }

    public LazyLogger addPrinter(Printer printer) {
        printers.add(printer);
        return this;
    }
}
