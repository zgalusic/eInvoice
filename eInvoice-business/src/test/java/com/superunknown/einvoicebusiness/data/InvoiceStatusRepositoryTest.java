package com.superunknown.einvoicebusiness.data;

import com.superunknown.einvoicebusiness.data.entity.InvoiceStatus;
import com.superunknown.einvoicebusiness.data.repository.InvoiceStatusRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class InvoiceStatusRepositoryTest {

    @Autowired
    private InvoiceStatusRepository invoiceStatusRepository;

    @Test
    void fetchAll() {

        Optional<InvoiceStatus> invoiceStatus = invoiceStatusRepository.findById(1L);
        assertTrue(invoiceStatus.isPresent());
    }
}
