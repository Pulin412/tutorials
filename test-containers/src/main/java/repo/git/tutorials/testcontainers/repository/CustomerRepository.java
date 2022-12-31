package repo.git.tutorials.testcontainers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import repo.git.tutorials.testcontainers.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
