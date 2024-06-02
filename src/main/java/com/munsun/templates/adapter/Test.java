package com.munsun.templates.adapter;

import com.munsun.templates.adapter.impl.MicroSdCard;
import com.munsun.templates.adapter.impl.Notebook;
import com.munsun.templates.adapter.impl.UsbAdapter;

public class Test {
    public static void main(String[] args) {
        MemoryCard card = new MicroSdCard();
        MemoryCardUsb adapter = new UsbAdapter(card);
        Computer computer = new Notebook();
            computer.connect(adapter);
    }
}
