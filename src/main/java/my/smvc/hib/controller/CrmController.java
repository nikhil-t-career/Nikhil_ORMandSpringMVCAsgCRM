package my.smvc.hib.controller;

import org.springframework.ui.Model;

import my.smvc.hib.entity.Customer;

public interface CrmController {


	String listCustomers(Model model);

	String showFormForAdd(Model model);

	String saveCustomer(Customer student);

	String showFormForUpdate(int id, Model model);

	String deleteCustomer(int id);

	

}
