package com.munsun.templates.proxy;

import com.munsun.templates.singleton.Logger;
import com.munsun.templates.singleton.impl.LazyLogger;

public class Proxy implements Database{
    private Database database;
    private Logger logger = LazyLogger.getLogger();

    public Proxy(Database database) {
        this.database = database;
    }

    @Override
    public void connect(String nameDatabase) {
        String pathDatabase = String.format("localhost:port/%s", nameDatabase);
        logger.info(this, String.format("Сonnecting to the database, path=%s", pathDatabase));
        database.connect(pathDatabase);
    }
}
