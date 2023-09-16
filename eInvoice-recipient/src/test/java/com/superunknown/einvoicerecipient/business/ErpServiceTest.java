package com.superunknown.einvoicerecipient.business;

import com.superunknown.model.dto.InvoiceDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
//@ContextConfiguration(classes = {Producer.class, ErpServiceImpl.class})
//@ActiveProfiles("test")
public class ErpServiceTest {

    @Autowired
    private ErpService erpService;

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
