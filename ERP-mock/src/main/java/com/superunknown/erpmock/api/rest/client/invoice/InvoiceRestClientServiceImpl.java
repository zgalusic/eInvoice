package com.superunknown.erpmock.api.rest.client.invoice;

import com.superunknown.erpmock.api.rest.client.RestClient;
import com.superunknown.erpmock.api.rest.client.invoice.model.InvoiceResponse;
import com.superunknown.model.dto.InvoiceDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class InvoiceRestClientServiceImpl extends RestClient implements InvoiceRestClientService {

    private static final Logger LOGGER = LoggerFactory.getLogger(InvoiceRestClientServiceImpl.class);

    @Value("${recipient.invoice.service.url}")
    private String baseUrl;

    protected InvoiceRestClientServiceImpl(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    public InvoiceResponse create(InvoiceDto invoiceDto) {

        LOGGER.info("Sending create event for invoice");

        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromHttpUrl(baseUrl);
        String url = uriComponentsBuilder.toUriString();

        return executePost(url, invoiceDto, InvoiceResponse.class );

    }
}
