package com.superunknown.einvoicebusiness.business.service;

import com.superunknown.model.dto.InvoiceDto;

public interface InvoiceService {

    void send(InvoiceDto invoiceDto);
}
