package com.superunknown.crmmock.api.rest.client.invoice;

import com.superunknown.crmmock.api.rest.client.RestClient;
import com.superunknown.crmmock.api.rest.client.invoice.model.InvoiceResponse;
import com.superunknown.model.dto.CustomerDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class InvoiceRestClientServiceImpl extends RestClient implements InvoiceRestClientService {

    private static final Logger LOGGER = LoggerFactory.getLogger(InvoiceRestClientServiceImpl.class);

    @Value("${invoice.service.url}")
    private String baseUrl;

    protected InvoiceRestClientServiceImpl(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    public InvoiceResponse update(CustomerDto customerDto) {

        LOGGER.info("Sending update event for customer with id: {}", customerDto.getId());

        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromHttpUrl(baseUrl).path(InvoiceServiceRestURL.UPDATE_CUSTOMER.getUrl());
        String url = uriComponentsBuilder.toUriString();

        return executePost(url, customerDto, InvoiceResponse.class );
    }
}
