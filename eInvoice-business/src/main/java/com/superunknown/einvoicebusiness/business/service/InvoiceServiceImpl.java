package com.superunknown.einvoicebusiness.business.service;

import com.superunknown.einvoicebusiness.api.jms.erp.ErpJmsProducer;
import com.superunknown.model.dto.InvoiceDto;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    private final ErpJmsProducer erpJmsProducer;

    public InvoiceServiceImpl(ErpJmsProducer erpJmsProducer) {
        this.erpJmsProducer = erpJmsProducer;
    }

    @Override
    public void send(InvoiceDto invoiceDto) {

        erpJmsProducer.sendMessage(invoiceDto);
    }
}
