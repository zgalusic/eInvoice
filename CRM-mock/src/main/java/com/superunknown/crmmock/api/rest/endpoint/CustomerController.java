package com.superunknown.crmmock.api.rest.endpoint;

import com.superunknown.crmmock.api.rest.endpoint.model.CrmResponse;
import com.superunknown.crmmock.business.CustomerService;
import com.superunknown.model.dto.CustomerDto;
import com.superunknown.model.wrapper.ResponseWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/rest/customer", produces = MediaType.APPLICATION_JSON_VALUE)
public class CustomerController {

    private final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("{id}")
    public CrmResponse<CustomerDto> fetch(@PathVariable String id) {

        LOGGER.info("Fetch customer with ID: {}", id);

        CrmResponse<CustomerDto> customerCrmResponse = new CrmResponse<>();

        customerCrmResponse.setMessage("Customer successfully retrieved.");
        CustomerDto customer = customerService.findById(id);
        customerCrmResponse.setData(customer);

        return customerCrmResponse;
    }

    @GetMapping("/all")
    public CrmResponse<List<CustomerDto>> fetchAllCustomers() {

        LOGGER.info("Fetch all customers from CRM");

        CrmResponse<List<CustomerDto>> customerCrmResponse = new CrmResponse<>();

        customerCrmResponse.setMessage("Customers successfully retrieved.");
        List<CustomerDto> customerDtoList = customerService.findAll();
        customerCrmResponse.setData(customerDtoList);

        return customerCrmResponse;
    }

    @GetMapping
    public CrmResponse<List<CustomerDto>> fetchCustomersById(@RequestParam(value = "customerIds") List<String> customerIds) {

        LOGGER.info("Fetch customers with ids: {} from CRM", customerIds);

        CrmResponse<List<CustomerDto>> customerCrmResponse = new CrmResponse<>();

        customerCrmResponse.setMessage("Customers successfully retrieved.");
        List<CustomerDto> customerDtoList = customerService.findByIds(customerIds);
        customerCrmResponse.setData(customerDtoList);

        return customerCrmResponse;
    }

    @PostMapping
    public CrmResponse<Void> update(@RequestBody CustomerDto customerDto) {

        LOGGER.info("Update customer data.");

        CrmResponse<Void> responseWrapper = new CrmResponse<>();

        customerService.update(customerDto);
        responseWrapper.setMessage("Customer data updated.");

        return responseWrapper;

    }
}
