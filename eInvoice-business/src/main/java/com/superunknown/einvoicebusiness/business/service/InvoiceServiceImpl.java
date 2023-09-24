package com.superunknown.einvoicebusiness.business.service;

import com.superunknown.einvoicebusiness.api.jms.erp.ErpJmsProducer;
import com.superunknown.einvoicebusiness.data.InvoiceDataManager;
import com.superunknown.einvoicebusiness.data.entity.Invoice;
import com.superunknown.einvoicebusiness.data.entity.InvoiceStatus;
import com.superunknown.model.dto.InvoiceDto;
import com.superunknown.model.dto.InvoiceStatusDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    private final ErpJmsProducer erpJmsProducer;
    private final InvoiceDataManager invoiceDataManager;

    public InvoiceServiceImpl(ErpJmsProducer erpJmsProducer, InvoiceDataManager invoiceDataManager) {
        this.erpJmsProducer = erpJmsProducer;
        this.invoiceDataManager = invoiceDataManager;
    }

    @Override
    public List<InvoiceDto> findAll() {

        List<Invoice> invoiceList = invoiceDataManager.findAll();

        return invoiceList
                .stream()
                .map(invoice ->
                        new InvoiceDto(invoice.getId(),
                        invoice.getCustomerId(),
                        invoice.getTotalAmount(),
                        com.superunknown.model.dto.InvoiceStatus.findById( invoice.getInvoiceStatus().getId() ) ) )
                .toList();
    }

    @Override
    public Long create(InvoiceDto invoiceDto) {
        return invoiceDataManager.create(invoiceDto);
    }

    @Override
    public void send(InvoiceDto invoiceDto) {

        erpJmsProducer.sendMessage(invoiceDto);
    }

    @Override
    public List<InvoiceStatusDto> findAllInvoiceStatuses() {

        List<InvoiceStatus> invoiceStatusList = invoiceDataManager.findAllInvoiceStatuses();

        return invoiceStatusList
                .stream()
                .map(status -> new InvoiceStatusDto(status.getId(), status.getName()))
                .toList();
    }

    @Override
    public void updateCustomerData(List<String> customerIds) {

        // TODO
    }
}
