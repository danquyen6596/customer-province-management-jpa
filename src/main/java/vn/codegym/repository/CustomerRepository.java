package vn.codegym.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import vn.codegym.model.Customer;
import vn.codegym.model.Province;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Iterable<Customer> findAllByProvince(Province province);
}
