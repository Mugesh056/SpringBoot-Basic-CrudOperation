package Project.SpringCrud.Services;

import Project.SpringCrud.DTO.CustomerDTO;
import Project.SpringCrud.DTO.CustomerSaveDTO;
import Project.SpringCrud.DTO.CustomerUpdateDTO;

import java.util.List;

public interface CustomerService {

    String addCustomer(CustomerSaveDTO customerSaveDTO);


    List<CustomerDTO> getAllcustomer();


    String updateCustomers(CustomerUpdateDTO customerUpdateDTO);

    boolean deleteCustomer(int id);
}
