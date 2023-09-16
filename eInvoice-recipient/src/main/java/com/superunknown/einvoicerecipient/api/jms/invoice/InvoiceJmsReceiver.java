package com.superunknown.einvoicerecipient.api.jms.invoice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class InvoiceJmsReceiver {

    private final Logger LOGGER = LoggerFactory.getLogger(InvoiceJmsReceiver.class);

    @JmsListener(destination = "${business.to.recipient.queue}")
    public <T> void receiveMessage(T message) {

        LOGGER.info("Received message {} from business.", message);

        // TODO
    }
}
