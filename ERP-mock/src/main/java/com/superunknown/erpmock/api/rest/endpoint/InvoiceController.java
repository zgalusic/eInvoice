package com.superunknown.erpmock.api.rest.endpoint;

import com.superunknown.erpmock.api.rest.endpoint.model.ErpResponse;
import com.superunknown.erpmock.business.model.Invoice;
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

    @PostMapping("/update-status")
    private ErpResponse<Void> updateStatus(@RequestBody Invoice invoice) {

        LOGGER.info("Update invoice: {}, with status: {}", invoice.getId(), invoice.getStatus());

        ErpResponse<Void> erpResponse = new ErpResponse<>();
        erpResponse.setMessage("Status updated SUCCESSFULLY.");

        return erpResponse;
    }
}
