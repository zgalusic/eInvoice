package com.superunknown.einvoicebusiness.data;

import com.superunknown.einvoicebusiness.data.entity.Invoice;
import com.superunknown.einvoicebusiness.data.entity.InvoiceStatus;
import com.superunknown.model.dto.InvoiceDto;

import java.util.List;

public interface InvoiceDataManager {

    List<Invoice> findAll();
    long create(InvoiceDto invoiceDto);
    List<InvoiceStatus> findAllInvoiceStatuses();
}
