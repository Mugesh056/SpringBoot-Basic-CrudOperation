package Project.SpringCrud.CustomerControl;

import Project.SpringCrud.DTO.CustomerDTO;
import Project.SpringCrud.DTO.CustomerSaveDTO;
import Project.SpringCrud.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class customerController {

     @Autowired
     private CustomerService customerService;

     @PostMapping(path = "/save")
     public String saveCustomer(@RequestBody CustomerSaveDTO customerSaveDTO){

        String id= customerService.addCustomer(customerSaveDTO);
        return id;
    }

    @GetMapping(path = "/getAllCustomer")
    public List<CustomerDTO> getAllCustomer(){
         List<CustomerDTO> allCustomer=customerService.getAllcustomer();
         return allCustomer;
    }


}
