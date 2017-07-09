package com.youyigejia.crm.service.impl;

import com.youyigejia.crm.domain.Customer;
import com.youyigejia.crm.mapper.CustomerMapper;
import com.youyigejia.crm.queryvo.CustomerQueryVo;
import com.youyigejia.crm.service.CustomerService;
import com.youyigejia.crm.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 张磊 on 2017/7/8.
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerMapper customerMapper;

    @Override
    public Page<Customer> search(CustomerQueryVo customerQueryVo) {
        Page<Customer> page = new Page<>();
        Integer count = customerMapper.count(customerQueryVo);
        List<Customer> search = customerMapper.search(customerQueryVo);
        page.setRows(search);
        page.setTotal(count);
        page.setPage(customerQueryVo.getPage());
        return page;
    }

    @Override
    public Customer selectByPrimaryKey(Long custId) {
        return customerMapper.selectByPrimaryKey(custId);
    }

    @Override
    public int updateByPrimaryKeySelective(Customer record) {
        return customerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Long custId) {
        return customerMapper.deleteByPrimaryKey(custId);
    }
}
