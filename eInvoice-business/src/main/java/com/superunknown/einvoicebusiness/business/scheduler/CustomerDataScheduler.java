package com.superunknown.einvoicebusiness.business.scheduler;

import com.superunknown.einvoicebusiness.business.service.InvoiceService;
import com.superunknown.einvoicebusiness.data.InvoiceDataManager;
import com.superunknown.model.dto.InvoiceStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerDataScheduler {

    private final Logger LOGGER = LoggerFactory.getLogger(CustomerDataScheduler.class);

    private final InvoiceDataManager invoiceDataManager;
    private final InvoiceService invoiceService;

    public CustomerDataScheduler(InvoiceDataManager invoiceDataManager, InvoiceService invoiceService) {
        this.invoiceDataManager = invoiceDataManager;
        this.invoiceService = invoiceService;
    }

    @Scheduled(cron = "${complete.customer.data.cron}")
    public void fillCustomerData() {

        LOGGER.debug("CustomerDataScheduler triggered!");

        List<String> customerIdList = invoiceDataManager.findDistinctCustomerIds(InvoiceStatus.INCOMPLETE_DATA.getId());

        invoiceService.updateCustomerData(customerIdList);
    }
}
