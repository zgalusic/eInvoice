package com.superunknown.erpmock.api.rest.client.invoice;

import com.superunknown.erpmock.api.rest.client.invoice.model.InvoiceResponse;
import com.superunknown.model.dto.InvoiceDto;

public interface InvoiceRestClientService {

    InvoiceResponse create(InvoiceDto invoiceDto);
}
