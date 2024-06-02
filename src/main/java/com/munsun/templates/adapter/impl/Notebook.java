package com.munsun.templates.adapter.impl;

import com.munsun.templates.adapter.Computer;
import com.munsun.templates.adapter.MemoryCard;
import com.munsun.templates.adapter.MemoryCardUsb;
import com.munsun.templates.singleton.Logger;
import com.munsun.templates.singleton.impl.LazyLogger;

public class Notebook implements Computer {
    private Logger logger = LazyLogger.getLogger();
    @Override
    public void connect(MemoryCardUsb card) {
        logger.info(this,"An attempt to connect a memory card...");
        card.set();
        logger.info(this,"Memory card is connected");
    }
}
