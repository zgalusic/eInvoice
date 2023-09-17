package com.superunknown.einvoicebusiness.data;

import com.superunknown.einvoicebusiness.data.entity.InvoiceStatus;

import java.util.List;

public interface InvoiceDataManager {

    List<InvoiceStatus> findAllInvoiceStatuses();
}
