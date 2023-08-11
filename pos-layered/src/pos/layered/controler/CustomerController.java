/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.controler;

import pos.layered.dto.CustomerDto;
import pos.layered.service.ServiceFactory;
import pos.layered.service.customer.CustomerService;

/**
 *
 * @author Himasha Lokusuriya
 */
public class CustomerController {
    
    CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.Customer);

    public String addCustomer(CustomerDto customerDto) throws Exception {
        return customerService.addCustomer(customerDto);
    }
    
}
