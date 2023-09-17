package com.superunknown.einvoicebusiness.data.repository;

import com.superunknown.einvoicebusiness.data.entity.InvoiceStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceStatusRepository extends CrudRepository<InvoiceStatus, Long> {
}
