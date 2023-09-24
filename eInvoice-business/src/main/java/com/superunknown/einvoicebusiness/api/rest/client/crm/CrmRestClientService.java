package com.superunknown.einvoicebusiness.api.rest.client.crm;

import com.superunknown.model.dto.CustomerDto;
import com.superunknown.model.wrapper.ResponseWrapper;

import java.util.List;

public interface CrmRestClientService {

    ResponseWrapper<CustomerDto> fetchCustomerData(String id);
    ResponseWrapper<List<CustomerDto>> fetchCustomers(List<String> customerIds);
}
