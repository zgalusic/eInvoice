package com.superunknown.einvoicerecipient.api.jms.invoice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class InvoiceJmsProducer {

    private final Logger LOGGER = LoggerFactory.getLogger(InvoiceJmsProducer.class);

    @Value("${recipient.to.business.queue}")
    private String destination;
    private final JmsTemplate jmsTemplate;

    public InvoiceJmsProducer(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public <T> void sendMessage(T message) {

        LOGGER.info("Sending message {} from ERP to business.", message);
        jmsTemplate.convertAndSend(destination, message);
    }
}
