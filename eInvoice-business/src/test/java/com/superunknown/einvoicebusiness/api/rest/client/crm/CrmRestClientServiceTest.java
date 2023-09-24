package com.superunknown.einvoicebusiness.api.rest.client.crm;

import com.superunknown.einvoicebusiness.config.RestClientConfig;
import com.superunknown.model.dto.CustomerDto;
import com.superunknown.model.wrapper.ResponseWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ContextConfiguration(classes = {RestClientConfig.class, CrmRestClientServiceImpl.class})
@ActiveProfiles("test")
public class CrmRestClientServiceTest {

    @Autowired
    private CrmRestClientService crmRestClientService;

    @Test
    void fetchCustomerData() {

        ResponseWrapper<CustomerDto> customer = crmRestClientService.fetchCustomerData("STIN");
        assertNotNull(customer);
    }

    @Test
    void fetchCustomers() {

        List<String> customerIdList = new ArrayList<>(){{
            add("STIN");
            add("ECHO");
        }};

        ResponseWrapper<List<CustomerDto>> customer = crmRestClientService.fetchCustomers(customerIdList);
        assertNotNull(customer);
    }
}
