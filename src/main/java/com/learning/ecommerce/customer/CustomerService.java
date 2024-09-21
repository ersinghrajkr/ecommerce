package com.learning.ecommerce.customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> getAllCustomers();
    Optional<Customer> getCustomerById(String id);
    Customer saveCustomer(Customer customer);
    void deleteCustomer(String id);
}
