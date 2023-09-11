package com.superunknown.crmmock.api.rest.endpoint;

import com.superunknown.crmmock.api.rest.endpoint.model.CrmResponse;
import com.superunknown.crmmock.business.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/rest/customer", produces = MediaType.APPLICATION_JSON_VALUE)
public class CustomerController {

    private final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);

    @GetMapping("{id}")
    public CrmResponse<Customer> fetch(@PathVariable String id) {

        LOGGER.info("Fetch customer with ID: {}", id);

        CrmResponse<Customer> customerCrmResponse = new CrmResponse<>();

        // TODO

        return customerCrmResponse;
    }
}
