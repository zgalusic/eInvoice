package com.superunknown.einvoicerecipient.business;

import com.superunknown.model.dto.InvoiceDto;

public interface ErpService {

    void send(InvoiceDto invoiceDto);
}
