package com.superunknown.einvoicebusiness.api.rest.endpoint;

import com.superunknown.einvoicebusiness.business.service.InvoiceService;
import com.superunknown.model.dto.CustomerDto;
import com.superunknown.model.dto.InvoiceStatusDto;
import com.superunknown.model.wrapper.ResponseWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/rest/invoice", produces = MediaType.APPLICATION_JSON_VALUE)
public class InvoiceController {

    private final Logger LOGGER = LoggerFactory.getLogger(InvoiceController.class);

    private final InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @PostMapping("/customer")
    public ResponseWrapper<Void> changeCustomerData(@RequestBody CustomerDto customerDto) {

        LOGGER.info("Receiving customer data change event for customer with ID: {}", customerDto.getId());

        // TODO
        ResponseWrapper<Void> responseWrapper = new ResponseWrapper<>();
        responseWrapper.setMessage("Customer data updated.");

        return responseWrapper;
    }

    @GetMapping("/status")
    public ResponseWrapper<List<InvoiceStatusDto>> findAllInvoiceStatuses() {

        List<InvoiceStatusDto> invoiceStatusDtoList = invoiceService.findAllInvoiceStatuses();

        ResponseWrapper<List<InvoiceStatusDto>> responseWrapper = new ResponseWrapper<>();
        responseWrapper.setMessage("All statuses fetched");
        responseWrapper.setData(invoiceStatusDtoList);

        return responseWrapper;
    }
}
