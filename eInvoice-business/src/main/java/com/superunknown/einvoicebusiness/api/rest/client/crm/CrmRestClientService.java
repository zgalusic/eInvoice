package com.superunknown.einvoicebusiness.api.rest.client.crm;

import com.superunknown.einvoicebusiness.api.rest.client.crm.model.CrmResponse;
import com.superunknown.einvoicebusiness.api.rest.client.crm.model.Customer;

public interface CrmRestClientService {

    CrmResponse fetchCustomerData(String id);
}
