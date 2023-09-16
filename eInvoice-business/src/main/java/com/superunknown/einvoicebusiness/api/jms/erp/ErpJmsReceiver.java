package com.superunknown.einvoicebusiness.api.jms.erp;

import com.superunknown.model.dto.InvoiceDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class ErpJmsReceiver {

    private final Logger LOGGER = LoggerFactory.getLogger(ErpJmsReceiver.class);

    @JmsListener(destination = "${recipient.to.business.queue}")
    public <T> void receiveMessage(Message<T> message) {

        Object payload = message.getPayload();

        LOGGER.info("Received message type {} from ERP.", payload.getClass());

        if(payload instanceof InvoiceDto) {

            LOGGER.info("New invoice received: {}", payload);

        } else {

            LOGGER.info("Unknown msg received: {}", payload);
        }

    }
}
