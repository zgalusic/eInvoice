package com.superunknown.einvoicebusiness.data.repository;

import com.superunknown.einvoicebusiness.data.entity.Invoice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepository extends ListCrudRepository<Invoice, Long> {

    @Query(value = "SELECT DISTINCT customer_id FROM invoice WHERE status_id = :statusId", nativeQuery = true)
    List<String> findDistinctCustomerIds(Integer statusId);
}
