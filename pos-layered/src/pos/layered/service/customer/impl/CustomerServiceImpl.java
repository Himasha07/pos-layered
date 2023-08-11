/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.service.customer.impl;

import pos.layered.dao.customer.CustomerDao;
import pos.layered.dao.DaoFactory;
import pos.layered.dto.CustomerDto;
import pos.layered.entity.CustomerEntity;
import pos.layered.service.customer.CustomerService;

/**
 *
 * @author Himasha Lokusuriya
 */
public class CustomerServiceImpl implements CustomerService{
    
    CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.daoType.CUSTOMER);
    
    public String addCustomer(CustomerDto dto) throws Exception{
        
        CustomerEntity ce = new CustomerEntity(dto.getId(),
                dto.getTitle(),
                dto.getName(),
                dto.getDob(),
                dto.getSalary(),
                dto.getAddress(),
                dto.getCity(),
                dto.getProvince(),
                dto.getZip());
        
        if(customerDao.addCustomer(ce)){
            return "Successfully added";
        }
        return "Fail";
    
    }
    
}
