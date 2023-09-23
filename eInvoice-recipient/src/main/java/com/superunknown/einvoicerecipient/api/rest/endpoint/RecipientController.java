package com.superunknown.einvoicerecipient.api.rest.endpoint;

import com.superunknown.einvoicerecipient.api.rest.endpoint.model.RecipientResponse;
import com.superunknown.einvoicerecipient.business.ErpService;
import com.superunknown.model.dto.InvoiceDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/rest/invoice", produces = MediaType.APPLICATION_JSON_VALUE)
public class RecipientController {

    private final Logger LOGGER = LoggerFactory.getLogger(RecipientController.class);

    private final ErpService erpService;

    public RecipientController(ErpService erpService) {
        this.erpService = erpService;
    }

    @PostMapping
    private RecipientResponse create(@RequestBody InvoiceDto invoiceDto) {

        LOGGER.info("Update invoice: {}, with status: {}", invoiceDto.getId(), invoiceDto.getInvoiceStatus());

        erpService.send(invoiceDto);

        RecipientResponse recipientResponse = new RecipientResponse();
        recipientResponse.setMessage("Invoice sent SUCCESSFULLY.");

        return recipientResponse;
    }
}
