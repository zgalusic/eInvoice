package com.superunknown.intermediarymock.api.rest.endpoint;

import com.superunknown.intermediarymock.api.rest.endpoint.model.IntermediaryResponse;
import com.superunknown.intermediarymock.business.model.Invoice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/rest/invoice", produces = MediaType.APPLICATION_JSON_VALUE)
public class InvoiceController {

    private final Logger LOGGER = LoggerFactory.getLogger(InvoiceController.class);

    @PostMapping("/create")
    public IntermediaryResponse<Void> create(@RequestBody Invoice invoice) {

        LOGGER.info("Creating a new invoice");

        IntermediaryResponse<Void> response = new IntermediaryResponse<>();

        // TODO

        return response;
    }

    @GetMapping("/{id}/status")
    public IntermediaryResponse<Invoice> getStatus(@PathVariable String id) {

        IntermediaryResponse<Invoice> response = new IntermediaryResponse<>();

        // TODO

        return response;
    }
}
