package com.superunknown.einvoicebusiness.api.rest.client.crm;

import com.superunknown.einvoicebusiness.api.rest.client.RestClient;
import com.superunknown.einvoicebusiness.api.rest.client.crm.model.CrmResponse;
import com.superunknown.einvoicebusiness.api.rest.client.crm.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
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
    public CrmResponse fetchCustomerData(String id) {

        LOGGER.info("Fetch customer data from CRM for id: {}", id);

        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromHttpUrl(baseUrl).path(CrmRestURL.CUSTOMER_DATA.getUrl());
        Map<String, String> urlParams = new HashMap<>();
        urlParams.put(QueryParameter.ID.getName(), id);
        String url = uriComponentsBuilder.buildAndExpand(urlParams).toUriString();

        return executeGet(url, CrmResponse.class);
    }
}
