package com.youyigejia.crm.controller;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by 张磊 on 2017/7/9.
 */
public class CustomerControllerTest {
    @Test
    public void query() throws Exception {
        CustomerController customerController=new CustomerController();
        MockMvc mockMvc= standaloneSetup(customerController).build();
        ResultActions perform = mockMvc.perform(get("/customer/1"));

    }

}