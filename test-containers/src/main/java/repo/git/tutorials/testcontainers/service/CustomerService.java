package repo.git.tutorials.testcontainers.service;

import repo.git.tutorials.testcontainers.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAll();

    Customer add(Customer customer);

    Customer update(Customer customer);

    void delete(long id);

    Customer getCustomerById(long id);
}
