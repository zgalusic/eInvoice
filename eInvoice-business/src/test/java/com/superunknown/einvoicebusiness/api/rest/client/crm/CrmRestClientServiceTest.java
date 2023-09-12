package com.superunknown.einvoicebusiness.api.rest.client.crm;

import com.superunknown.einvoicebusiness.api.rest.client.crm.model.CrmResponse;
import com.superunknown.einvoicebusiness.api.rest.client.crm.model.Customer;
import com.superunknown.einvoicebusiness.config.RestClientConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ContextConfiguration(classes = {RestClientConfig.class, CrmRestClientServiceImpl.class})
@ActiveProfiles("test")
public class CrmRestClientServiceTest {

    @Autowired
    private CrmRestClientService crmRestClientService;

    @Test
    void fetchCustomerData() {

        CrmResponse customer = crmRestClientService.fetchCustomerData("dahjsdoasj");
        assertNotNull(customer);
    }
}
