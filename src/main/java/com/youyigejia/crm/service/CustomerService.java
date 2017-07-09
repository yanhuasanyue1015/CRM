package com.youyigejia.crm.service;

import com.youyigejia.crm.domain.Customer;
import com.youyigejia.crm.queryvo.CustomerQueryVo;
import com.youyigejia.crm.util.Page;

/**
 * Created by 张磊 on 2017/7/8.
 */
public interface CustomerService {
    Page<Customer> search(CustomerQueryVo customerQueryVo);
    Customer selectByPrimaryKey(Long custId);
    int updateByPrimaryKeySelective(Customer record);
    int deleteByPrimaryKey(Long custId);
}
