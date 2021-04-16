package au.com.nab.icommerce.customer.service.repository;

import au.com.nab.icommerce.customer.service.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Customer getCustomerById(Integer id);
}
