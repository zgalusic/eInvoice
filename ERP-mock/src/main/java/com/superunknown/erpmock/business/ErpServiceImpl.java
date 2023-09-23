package com.superunknown.erpmock.business;

import com.superunknown.erpmock.api.rest.client.invoice.InvoiceRestClientService;
import com.superunknown.model.dto.InvoiceDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ErpServiceImpl implements ErpService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ErpServiceImpl.class);

    private final InvoiceRestClientService invoiceRestClientService;

    public ErpServiceImpl(InvoiceRestClientService invoiceRestClientService) {
        this.invoiceRestClientService = invoiceRestClientService;
    }

    @Override
    public void create(InvoiceDto invoiceDto) {

        invoiceRestClientService.create(invoiceDto);
    }
}
