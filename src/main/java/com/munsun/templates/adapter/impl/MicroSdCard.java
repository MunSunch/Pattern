package com.munsun.templates.adapter.impl;

import com.munsun.templates.adapter.MemoryCard;
import com.munsun.templates.singleton.Logger;
import com.munsun.templates.singleton.impl.LazyLogger;

public class MicroSdCard implements MemoryCard {
    private Logger logger = LazyLogger.getLogger();
    @Override
    public void set() {
        logger.info(this, "MicroSdCard is connected");
    }
}
