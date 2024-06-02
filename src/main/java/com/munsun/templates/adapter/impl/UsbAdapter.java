package com.munsun.templates.adapter.impl;

import com.munsun.templates.adapter.MemoryCard;
import com.munsun.templates.adapter.MemoryCardUsb;
import com.munsun.templates.singleton.Logger;
import com.munsun.templates.singleton.impl.LazyLogger;

public class UsbAdapter implements MemoryCardUsb {
    private MemoryCard memoryCard;
    private Logger logger = LazyLogger.getLogger();

    public UsbAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void set() {
        logger.info(this, "Attempting to connect a memory card via an adapter...");
        memoryCard.set();
        logger.info(this, "Attempting to connect a memory card via an adapter: success");
    }
}
