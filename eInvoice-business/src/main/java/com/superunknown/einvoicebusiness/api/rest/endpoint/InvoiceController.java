package com.superunknown.einvoicebusiness.api.rest.endpoint;

import com.superunknown.model.dto.CustomerDto;
import com.superunknown.model.wrapper.ResponseWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/rest/invoice", produces = MediaType.APPLICATION_JSON_VALUE)
public class InvoiceController {

    private final Logger LOGGER = LoggerFactory.getLogger(InvoiceController.class);

    @PostMapping("/customer")
    public ResponseWrapper<Void> changeCustomerData(@RequestBody CustomerDto customerDto) {

        LOGGER.info("Receiving customer data change event for customer with ID: {}", customerDto.getId());

        // TODO
        ResponseWrapper<Void> responseWrapper = new ResponseWrapper<>();
        responseWrapper.setMessage("Customer data updated.");

        return responseWrapper;
    }
}
