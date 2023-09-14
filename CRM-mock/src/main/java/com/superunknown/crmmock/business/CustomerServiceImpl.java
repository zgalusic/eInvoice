package com.superunknown.crmmock.business;

import com.superunknown.crmmock.api.rest.client.invoice.InvoiceRestClientService;
import com.superunknown.crmmock.business.model.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final InvoiceRestClientService invoiceRestClientService;

    public CustomerServiceImpl(InvoiceRestClientService invoiceRestClientService) {
        this.invoiceRestClientService = invoiceRestClientService;
    }


    @Override
    public void update(Customer customer) {
        invoiceRestClientService.update(customer);
    }
}
