package com.superunknown.einvoicebusiness.api.rest.client.crm;

import com.superunknown.einvoicebusiness.api.rest.client.RestClient;
import com.superunknown.model.dto.CustomerDto;
import com.superunknown.model.wrapper.ResponseWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CrmRestClientServiceImpl extends RestClient implements CrmRestClientService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CrmRestClientServiceImpl.class);

    @Value("${crm.customer.service.url}")
    private String baseUrl;

    protected CrmRestClientServiceImpl(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    public ResponseWrapper<CustomerDto> fetchCustomerData(String id) {

        LOGGER.info("Fetch customer data from CRM for id: {}", id);

        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromHttpUrl(baseUrl).path(CrmRestURL.CUSTOMER_DATA.getUrl());
        Map<String, String> urlParams = new HashMap<>();
        urlParams.put(QueryParameter.ID.getName(), id);
        String url = uriComponentsBuilder.buildAndExpand(urlParams).toUriString();

        return executeGet(url, ResponseWrapper.class);
    }

    @Override
    public ResponseWrapper<List<CustomerDto>> fetchCustomers(List<String> customerIds) {

        LOGGER.info("Fetch customers from CRM with ids: {}", customerIds);

        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromHttpUrl(baseUrl).queryParam("customerIds", customerIds);
        String url = uriComponentsBuilder.toUriString();

        return executeGet(url, ResponseWrapper.class);
    }
}
