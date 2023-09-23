package com.superunknown.einvoicebusiness.data.repository;

import com.superunknown.einvoicebusiness.data.entity.Invoice;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends ListCrudRepository<Invoice, Long> {
}
