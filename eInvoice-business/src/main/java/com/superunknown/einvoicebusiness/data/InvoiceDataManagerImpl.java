package com.superunknown.einvoicebusiness.data;

import com.superunknown.einvoicebusiness.data.entity.Invoice;
import com.superunknown.einvoicebusiness.data.entity.InvoiceStatus;
import com.superunknown.einvoicebusiness.data.repository.InvoiceRepository;
import com.superunknown.einvoicebusiness.data.repository.InvoiceStatusRepository;
import com.superunknown.model.dto.InvoiceDto;
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
    public List<Invoice> findAll() {

        return invoiceRepository.findAll();
    }

    public long create(InvoiceDto invoiceDto) {

        Invoice invoice = new Invoice();
        invoice.setCustomerId(invoiceDto.getCustomerId());
        invoice.setTotalAmount(invoiceDto.getTotalAmount());
        InvoiceStatus invoiceStatus = new InvoiceStatus();
        invoiceStatus.setId(com.superunknown.model.dto.InvoiceStatus.INCOMPLETE_DATA.getId());
        invoice.setInvoiceStatus(invoiceStatus);

        Invoice savedInvoice = invoiceRepository.save(invoice);

        return savedInvoice.getId();
    }

    @Override
    public List<InvoiceStatus> findAllInvoiceStatuses() {

        return invoiceStatusRepository.findAll();
    }

    @Override
    public List<String> findDistinctCustomerIds(Integer statusId) {
        return invoiceRepository.findDistinctCustomerIds(statusId);
    }
}
