package com.munsun.templates.proxy;

import com.munsun.templates.singleton.Logger;
import com.munsun.templates.singleton.impl.LazyLogger;

public class PostgresDB implements Database {
    private Logger logger = LazyLogger.getLogger();
    @Override
    public void connect(String nameDatabase) {
        logger.info(this, String.format("Connect to %s", nameDatabase));
    }
}
