/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.layered.service.customer;

import pos.layered.dto.CustomerDto;
import pos.layered.service.SuperService;

/**
 *
 * @author Himasha Lokusuriya
 */
public interface CustomerService extends SuperService {
    String addCustomer(CustomerDto customerDto)throws Exception;
}
