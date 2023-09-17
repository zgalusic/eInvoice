package com.superunknown.einvoicebusiness.business.service;

import com.superunknown.einvoicebusiness.data.entity.InvoiceStatus;
import com.superunknown.model.dto.InvoiceDto;
import com.superunknown.model.dto.InvoiceStatusDto;

import java.util.List;

public interface InvoiceService {

    void send(InvoiceDto invoiceDto);
    List<InvoiceStatusDto> findAllInvoiceStatuses();
}
