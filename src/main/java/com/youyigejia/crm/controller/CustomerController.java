package com.youyigejia.crm.controller;

import com.youyigejia.crm.config.PageConfig;
import com.youyigejia.crm.domain.BaseDict;
import com.youyigejia.crm.domain.Customer;
import com.youyigejia.crm.queryvo.CustomerQueryVo;
import com.youyigejia.crm.queryvo.QueryVoProxyFactory;
import com.youyigejia.crm.service.BaseDictService;
import com.youyigejia.crm.service.CustomerService;
import com.youyigejia.crm.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 张磊 on 2017/7/8.
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    BaseDictService baseDictService;
    @Autowired
    CustomerService customerService;
    @Value("${from.type}")
    private String from;
    @Value("${industry.type}")
    private String business;
    @Value("${level.type}")
    private String level;
    private final String FromType = "fromType";
    private final String IndustryType = "industryType";
    private final String LevelType = "levelType";

    @RequestMapping("/home.html")
    public String home(Model model) {
        putDictToModel(model);
        putListToModel(new CustomerQueryVo(), model);
        return "customer";
    }

    @RequestMapping("/list.html")
    public String query(CustomerQueryVo customerQueryVo, Model model) {
        putListToModel(customerQueryVo, model);
        putDictToModel(model);
        return "customer";
    }

    @RequestMapping(value = "/{id}")
    @ResponseBody
    public Customer query(@PathVariable Long id) {
        Customer customer = customerService.selectByPrimaryKey(id);
        return customer;
    }

    @RequestMapping(value = "/update.action")
    @ResponseBody
    public String update(Customer customer) {
        customerService.updateByPrimaryKeySelective(customer);
        return "OK";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable Long id) {
        customerService.deleteByPrimaryKey(id);
        return "OK";
    }

    private void putListToModel(CustomerQueryVo customerQueryVo, Model model) {
        CustomerQueryVo temp = QueryVoProxyFactory.stringReturnTypeProxy(customerQueryVo);
        Page<Customer> page = customerService.search(temp);
        model.addAttribute(PageConfig.Page, page);
    }

    private void putDictToModel(Model model) {
        List<BaseDict> fromType = baseDictService.searchByDictTypeCode(from);
        List<BaseDict> industryType = baseDictService.searchByDictTypeCode(business);
        List<BaseDict> levelType = baseDictService.searchByDictTypeCode(level);
        model.addAttribute(FromType, fromType);
        model.addAttribute(IndustryType, industryType);
        model.addAttribute(LevelType, levelType);
    }

}
