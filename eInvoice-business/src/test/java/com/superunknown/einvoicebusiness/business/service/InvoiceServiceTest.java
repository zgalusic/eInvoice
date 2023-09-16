package com.superunknown.einvoicebusiness.business.service;

import com.superunknown.model.dto.InvoiceDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class InvoiceServiceTest {

    @Autowired
    private InvoiceService erpService;

    @Test
    void send() {

        InvoiceDto invoiceDto = new InvoiceDto();
        invoiceDto.setId("sdfsdf");
        invoiceDto.setCustomerId("dsf");
        invoiceDto.setStatus("status");
        invoiceDto.setTotalAmount(BigDecimal.TEN);

        erpService.send(invoiceDto);
    }
}
