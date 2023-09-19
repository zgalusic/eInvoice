package com.superunknown.crmmock.business;

import com.superunknown.crmmock.api.rest.client.invoice.InvoiceRestClientService;
import com.superunknown.model.dto.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final InvoiceRestClientService invoiceRestClientService;
    private final List<CustomerDto> customerDtoList;

    public CustomerServiceImpl(InvoiceRestClientService invoiceRestClientService) {
        this.invoiceRestClientService = invoiceRestClientService;
        customerDtoList = new ArrayList<>() {{
            add(new CustomerDto("STIN", "StellarTech Innovations"));
            add(new CustomerDto("QDYS", "Quantum Dynamics Solutions"));
            add(new CustomerDto("LXFC", "LuxeFusion Creations"));
            add(new CustomerDto("NVWT", "NovaWave Technologies"));
            add(new CustomerDto("ECHO", "EcoHarbor Ventures"));
            add(new CustomerDto("SCIN", "SerenityCraft Industries"));
            add(new CustomerDto("CRGE", "CrystalGrove Enterprises"));
            add(new CustomerDto("INPS", "InfinityPulse Systems"));
            add(new CustomerDto("OCHH", "OceanicHorizon Holdings"));
            add(new CustomerDto("ZSIN", "ZenithScape Innovations"));
        }};
    }


    @Override
    public void update(CustomerDto customer) {

        invoiceRestClientService.update(customer);
    }

    @Override
    public List<CustomerDto> findAll() {

        return customerDtoList;
    }

    @Override
    public CustomerDto findById(String id) {

        return customerDtoList
                .stream()
                .filter(customer -> customer.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
