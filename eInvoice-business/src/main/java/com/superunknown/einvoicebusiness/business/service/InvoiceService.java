package com.superunknown.einvoicebusiness.business.service;

import com.superunknown.einvoicebusiness.data.entity.InvoiceStatus;
import com.superunknown.model.dto.InvoiceDto;
import com.superunknown.model.dto.InvoiceStatusDto;

import java.util.List;

public interface InvoiceService {

    List<InvoiceDto> findAll();
    Long create(InvoiceDto invoiceDto);
    void send(InvoiceDto invoiceDto);
    List<InvoiceStatusDto> findAllInvoiceStatuses();
}
