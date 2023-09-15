package com.superunknown.einvoicebusiness.api.jms.erp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    private final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

    @JmsListener(destination = "${incoming.erp-business.queue}", containerFactory = "myFactory")
    public <T> void receiveMessage(T message) {

        LOGGER.info("Received message from ERP.");

        // TODO
    }
}
