package my.smvc.hib.service;

import java.util.List;

import my.smvc.hib.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theStudent);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);

}
