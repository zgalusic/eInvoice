package com.superunknown.crmmock.business;

import com.superunknown.model.dto.CustomerDto;

import java.util.List;

public interface CustomerService {

    void update(CustomerDto customerDto);
    List<CustomerDto> findAll();
    CustomerDto findById(String id);
    List<CustomerDto> findByIds(List<String> customerIds);
}
