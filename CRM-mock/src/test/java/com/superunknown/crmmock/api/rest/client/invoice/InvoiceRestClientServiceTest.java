package com.superunknown.crmmock.api.rest.client.invoice;

import com.superunknown.crmmock.api.rest.client.invoice.model.InvoiceResponse;
import com.superunknown.crmmock.business.model.Customer;
import com.superunknown.crmmock.config.RestClientConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ContextConfiguration(classes = {RestClientConfig.class, InvoiceRestClientServiceImpl.class})
@ActiveProfiles("test")
public class InvoiceRestClientServiceTest {

    @Autowired
    private InvoiceRestClientService invoiceRestClientService;

    @Test
    void update() {

        Customer customer = new Customer();
        customer.setId("iahiuasd");
        customer.setName("updated name");

        InvoiceResponse response = invoiceRestClientService.update(customer);
        assertNotNull(response);
    }
}
