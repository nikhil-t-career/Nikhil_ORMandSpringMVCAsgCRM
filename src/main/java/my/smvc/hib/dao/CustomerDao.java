package my.smvc.hib.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import my.smvc.hib.entity.Customer;

public interface CustomerDao {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer student);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
}
