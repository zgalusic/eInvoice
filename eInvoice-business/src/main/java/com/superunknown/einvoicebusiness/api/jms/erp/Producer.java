package com.superunknown.einvoicebusiness.api.jms.erp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {

    private final Logger LOGGER = LoggerFactory.getLogger(Producer.class);

    @Value("${outgoing.erp-business.queue}")
    private String destination;
    private final JmsTemplate jmsTemplate;

    public Producer(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public <T> void sendMessage(T message) {

        LOGGER.info("Sending message from business to ERP.");
        jmsTemplate.convertAndSend(destination, message);
    }
}
