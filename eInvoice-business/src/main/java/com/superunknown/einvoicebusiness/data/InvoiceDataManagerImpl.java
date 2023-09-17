package com.superunknown.einvoicebusiness.data;

import com.superunknown.einvoicebusiness.data.entity.InvoiceStatus;
import com.superunknown.einvoicebusiness.data.repository.InvoiceRepository;
import com.superunknown.einvoicebusiness.data.repository.InvoiceStatusRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InvoiceDataManagerImpl implements InvoiceDataManager {

    private final InvoiceRepository invoiceRepository;
    private final InvoiceStatusRepository invoiceStatusRepository;

    public InvoiceDataManagerImpl(InvoiceRepository invoiceRepository, InvoiceStatusRepository invoiceStatusRepository) {
        this.invoiceRepository = invoiceRepository;
        this.invoiceStatusRepository = invoiceStatusRepository;
    }

    @Override
    public List<InvoiceStatus> findAllInvoiceStatuses() {

        return invoiceStatusRepository.findAll();
    }
}
