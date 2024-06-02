package com.munsun.templates.singleton;

public interface Logger {
    void debug(Object object, String info);
    void info(Object object, String info);
    void warn(Object object, String info);
    void error(Object object, String info);
}
