package com.superunknown.einvoicerecipient.business;

import com.superunknown.einvoicerecipient.api.jms.invoice.InvoiceJmsProducer;
import com.superunknown.model.dto.InvoiceDto;
import org.springframework.stereotype.Service;

@Service
public class ErpServiceImpl implements ErpService {

    private final InvoiceJmsProducer invoiceJmsProducer;

    public ErpServiceImpl(InvoiceJmsProducer invoiceJmsProducer) {
        this.invoiceJmsProducer = invoiceJmsProducer;
    }

    @Override
    public void send(InvoiceDto invoiceDto) {

        invoiceJmsProducer.sendMessage(invoiceDto);
    }
}
