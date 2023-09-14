package com.superunknown.crmmock.api.rest.client.invoice;

import com.superunknown.crmmock.api.rest.client.invoice.model.InvoiceResponse;
import com.superunknown.crmmock.business.model.Customer;

public interface InvoiceRestClientService {

    InvoiceResponse update(Customer customer);
}
