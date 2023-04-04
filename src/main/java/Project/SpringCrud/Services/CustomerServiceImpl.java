package Project.SpringCrud.Services;

import Project.SpringCrud.CustomerRepo.CustomerRepo;
import Project.SpringCrud.DTO.CustomerDTO;
import Project.SpringCrud.DTO.CustomerSaveDTO;
import Project.SpringCrud.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{
   @Autowired
   private CustomerRepo customerRepo;





    @Override
    public String addCustomer(CustomerSaveDTO customerSaveDTO) {


        Customer customer=new Customer(

                customerSaveDTO.getCustomename(),
                customerSaveDTO.getCustomeaddres(),
                customerSaveDTO.getMobile()
        );
        customerRepo.save(customer);
        return customer.getCustomename();
    }

    @Override
    public List<CustomerDTO> getAllcustomer() {
        List<Customer> getCustomers = customerRepo.findAll();
        List<CustomerDTO> CustomerDTOList = new ArrayList<>();

        for (Customer a:getCustomers){

            CustomerDTO customerDTO=new CustomerDTO(

                    a.getCustomerid(),
                    a.getCustomename(),
                    a.getCustomeaddres(),
                    a.getMobile()
            );
            CustomerDTOList.add(customerDTO);
        }


        return CustomerDTOList;
    }


}
