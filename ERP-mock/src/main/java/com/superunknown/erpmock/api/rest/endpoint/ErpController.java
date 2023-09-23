package com.superunknown.erpmock.api.rest.endpoint;

import com.superunknown.erpmock.api.rest.endpoint.model.ErpResponse;
import com.superunknown.erpmock.business.ErpService;
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
public class ErpController {

    private final Logger LOGGER = LoggerFactory.getLogger(ErpController.class);

    private final ErpService erpService;

    public ErpController(ErpService erpService) {
        this.erpService = erpService;
    }

    @PostMapping("/update-status")
    private ErpResponse<Void> updateStatus(@RequestBody InvoiceDto invoiceDto) {

        LOGGER.info("Update invoice: {}, with status: {}", invoiceDto.getId(), invoiceDto.getInvoiceStatus());

        ErpResponse<Void> erpResponse = new ErpResponse<>();
        erpResponse.setMessage("Status updated SUCCESSFULLY.");

        return erpResponse;
    }

    @PostMapping
    private ErpResponse<Void> create(@RequestBody InvoiceDto invoiceDto) {

        LOGGER.info("Create invoice.");

        erpService.create(invoiceDto);

        ErpResponse<Void> erpResponse = new ErpResponse<>();
        erpResponse.setMessage("Invoice created SUCCESSFULLY.");

        return erpResponse;
    }
}
