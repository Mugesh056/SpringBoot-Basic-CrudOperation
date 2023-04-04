package Project.SpringCrud.Services;

import Project.SpringCrud.CustomerRepo.CustomerRepo;
import Project.SpringCrud.DTO.CustomerDTO;
import Project.SpringCrud.DTO.CustomerSaveDTO;
import Project.SpringCrud.DTO.CustomerUpdateDTO;
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

    @Override
    public String updateCustomers(CustomerUpdateDTO customerUpdateDTO) {
       if(customerRepo.existsById(customerUpdateDTO.getCustomerid())){

           Customer customer=customerRepo.getById(customerUpdateDTO.getCustomerid());
           customer.setCustomename(customerUpdateDTO.getCustomename());
           customer.setCustomeaddres(customerUpdateDTO.getCustomeaddres());
           customer.setMobile(customerUpdateDTO.getMobile());

           customerRepo.save(customer);
           System.out.println("Done.....");



       }else {
           System.out.println("Customer Id Do Not Exit....");
       }
       return null;
    }

    @Override
    public boolean deleteCustomer(int id) {
        if(customerRepo.existsById(id)){
            customerRepo.deleteById(id);
        }else {
            System.out.println("Customer Id Not Found....");
        }
        return  false;
    }


}
