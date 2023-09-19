package com.superunknown.crmmock.api.rest.client.invoice;

import com.superunknown.crmmock.api.rest.client.invoice.model.InvoiceResponse;
import com.superunknown.model.dto.CustomerDto;

public interface InvoiceRestClientService {

    InvoiceResponse update(CustomerDto customerDto);
}
