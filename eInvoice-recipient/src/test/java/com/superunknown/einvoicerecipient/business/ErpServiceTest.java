package com.superunknown.einvoicerecipient.business;

import com.superunknown.model.dto.InvoiceDto;
import com.superunknown.model.dto.InvoiceStatus;
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
        invoiceDto.setId(2L);
        invoiceDto.setCustomerId("dsf");
        invoiceDto.setInvoiceStatus(InvoiceStatus.INCOMPLETE_DATA);
        invoiceDto.setTotalAmount(BigDecimal.TEN);

        erpService.send(invoiceDto);
    }

}
