package repo.git.tutorials.testcontainers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repo.git.tutorials.testcontainers.model.Customer;
import repo.git.tutorials.testcontainers.service.CustomerService;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/customers")
    public ResponseEntity<Object> getAllCustomers() {
        List<Customer> customers = this.customerService.getAll();
        return ResponseEntity.ok(customers);
    }

    @GetMapping(value = "/customers/{id}")
    public ResponseEntity<Object> getCustomerById(@PathVariable("id") String id) {
        long _id = Long.parseLong(id);
        Customer customer = this.customerService.getCustomerById(_id);
        return ResponseEntity.ok(customer);
    }

    @PostMapping(value = "/customers")
    public ResponseEntity<Object> addCustomer(@RequestBody Customer customer) {
        Customer created = this.customerService.add(customer);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping(value = "/customers")
    public ResponseEntity<Object> updateCustomer(@RequestBody Customer customer) {
        Customer updated = this.customerService.update(customer);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping(value = "/customers/{id}")
    public ResponseEntity<Object> deleteCustomerById(@PathVariable("id") String id) {
        long _id = Long.parseLong(id);
        this.customerService.delete(_id);
        return ResponseEntity.ok().build();
    }
}
