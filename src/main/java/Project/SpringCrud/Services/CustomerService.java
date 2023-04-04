package Project.SpringCrud.Services;

import Project.SpringCrud.DTO.CustomerDTO;
import Project.SpringCrud.DTO.CustomerSaveDTO;

import java.util.List;

public interface CustomerService {

    String addCustomer(CustomerSaveDTO customerSaveDTO);

    List<CustomerDTO> getAllcustomer();
}
